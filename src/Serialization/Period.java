package Serialization;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class Period implements Serializable {
    final Date start;
    final Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " +
                    end);
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    public String toString() {
        return start + " - " + end;
    }

    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private static final long serialVersionUID = 234098243823485285L;

        private Object readResolve() {
            System.out.println("readResolve");
            return new Period(start, end);
        }
    }

    private Object writeReplace() {
        System.out.println("writeReplace");
        return new SerializationProxy(this);
    }

    private void readObject(ObjectInputStream stream)
            throws InvalidObjectException {
        System.out.println("readObject");
        throw new InvalidObjectException(" Proxy required ");
    }
}
