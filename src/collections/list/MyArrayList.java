package collections.list;

import javax.xml.bind.Element;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.util.*;

// "generic /very general, any type/ type" <E> (element)
public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;  // initial length of array
    private Object[] elementData;  // array of object
    private int size;  // size of elements inside of array list

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];  // initial an array of default capacity
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    // <? extends E> -> any type that extends E (subclass)
    // bounding
    public MyArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public boolean add(E e) {
        if (size == elementData.length) {
            // grow (increase by 50%)
            elementData = grow(size + 1);
        }
        elementData[size] = e;
        size++;
        return true;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    /*
    The maximum size of array to allocate
    Attempts to allocate larger arrays "may" result in OutOfMemoryOrder
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private int newCapacity(int minCapacity) {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);  // (oldCapacity + oldCapacity * 0.5
    if (newCapacity <= minCapacity) {
        if (minCapacity < 0 || minCapacity > MAX_ARRAY_SIZE) {
            throw new OutOfMemoryError("integer overflow");
        }
        return newCapacity;
    }
    return (newCapacity <= MAX_ARRAY_SIZE) ? newCapacity : MAX_ARRAY_SIZE;

    }

    @Override
    public boolean remove(Object o) {
        // In whole arrayList?
        if (indexOf(o) > 0 || o == elementData[0]) {
            System.arraycopy(elementData, indexOf(o) + 1, elementData, indexOf(o),size - indexOf(o));
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (int i = 0; i < c.size(); i++) {
            if (!(indexOf(c.toArray()[i]) > 0)) {
                return false;
            }
            }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (int i = 0; i < c.size(); i++) {
            if (elementData.length == size) {
                elementData = grow(size + 1);
            }
            elementData[size] = c.toArray()[i];
            size++;
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        int ind = index;
        if (index > size) {
            return false;
        }
        if (elementData.length <= size + c.size()) {
            elementData = grow(size + 1);
        }
        System.arraycopy(elementData, index, elementData, index + c.size(),size - index);
        for (int i = 0; i < c.size(); i++) {
            elementData[ind] = c.toArray()[i];
            size++;
            ind++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < elementData.length; j++)
                if (elementData[j] == c.toArray()[i]) {
                    System.arraycopy(elementData, j + 1, elementData, j, size - j);
                    size--;
                }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < elementData.length; j++)
                if (elementData[j] == c.toArray()[i]) {
                    break;
                } else if (elementData[j] != c.toArray()[i] && j == elementData.length - 1) {
                    return false;
                }
        }
        return true;
    }

    @Override
    public void clear() {
        elementData = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        }
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        }
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, E element) {
        try {
        if (elementData.length == size) {
            elementData = grow(size + 1);
        }
        System.arraycopy(elementData, index, elementData, index + 1,size - index);
        elementData[index] = element;
        size++;
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Index!");
        }
    }

    @Override
    public E remove(int index) {
        try {
            E oldValue = (E) elementData[index];
            System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
            this.size -= 1;
            return oldValue;
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid Index!");
        }
        return null;
    }


    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i > 0; i--) {
            if (elementData[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder newStringOutcome = new StringBuilder( "[" );
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                newStringOutcome.append(elementData[i]);
                break;
            }
            newStringOutcome.append(elementData[i] + ", ");
        }
        return "MyArrayList{" + newStringOutcome +
                "], size=" + size +
                '}';
    }
}
