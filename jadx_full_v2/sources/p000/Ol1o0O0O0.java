            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 4 */     public final class Ol1o0O0O0 implements Parcelable, OlO11I0O1l, List, RandomAccess, O0IloI1o {
                public static final Parcelable.Creator<Ol1o0O0O0> CREATOR = new Ol1o00oI(0);
                public OlO0o0 I00iOIl;

                public Ol1o0O0O0(I01Io11IiiiO i01Io11IiiiO) {
/* 4 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 14 */            OlO0o0 olO0o0 = new OlO0o0(ol1il1o1I000O01llI0.I000II(), i01Io11IiiiO);
/* 19 */            if (!(ol1il1o1I000O01llI0 instanceof Io0O010)) {
/* 28 */                olO0o0.I00000oOI = new OlO0o0(1L, i01Io11IiiiO);
                    }
/* 30 */            this.I00iOIl = olO0o0;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             olO1Ol0il0i.I00000oOI = this.I00iOIl;
/* 7 */             this.I00iOIl = (OlO0o0) olO1Ol0il0i;
                }

                public final void I000OiO(int i, int i2) {
                    int i3;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 62 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    i3 = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 17 */                OO100II1 oo100ii1I000iOII = i01Io11IiiiO.I000iOII();
/* 25 */                oo100ii1I000iOII.subList(i, i2).clear();
/* 28 */                I01Io11IiiiO i01Io11IiiiOI000OOo1O = oo100ii1I000iOII.I000OOo1O();
/* 36 */                if (O0000Ioio00.I0000O(i01Io11IiiiOI000OOo1O, i01Io11IiiiO)) {
/* 68 */                    return;
                        }
/* 38 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 43 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 54 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i3, i01Io11IiiiOI000OOo1O, true);
                        }
/* 59 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 62 */            } while (!zI00000oIO);
                }

                @Override
                public final boolean add(Object obj) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 53 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    i = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 17 */                I01Io11IiiiO i01Io11IiiiOI000OOo1O = i01Io11IiiiO.I000OOo1O(obj);
/* 25 */                if (i01Io11IiiiOI000OOo1O.equals(i01Io11IiiiO)) {
/* 27 */                    return false;
                        }
/* 29 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 34 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 45 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000OOo1O, true);
                        }
/* 50 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 53 */            } while (!zI00000oIO);
/* 44 */            return true;
                }

                @Override
                public final boolean addAll(Collection collection) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 53 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    i = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 17 */                I01Io11IiiiO i01Io11IiiiOI000OiO = i01Io11IiiiO.I000OiO(collection);
/* 25 */                if (O0000Ioio00.I0000O(i01Io11IiiiOI000OiO, i01Io11IiiiO)) {
/* 27 */                    return false;
                        }
/* 29 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 34 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 45 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000OiO, true);
                        }
/* 50 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 53 */            } while (!zI00000oIO);
/* 44 */            return true;
                }

                @Override
                public final void clear() {
                    Ol1il1o1 ol1il1o1I000O01llI0;
/* 1 */             OlO0o0 olO0o0 = this.I00iOIl;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 6 */                 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 14 */                OlO0o0 olO0o02 = (OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o0, this, ol1il1o1I000O01llI0);
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 21 */                    olO0o02.I0000Il00O = Ol1Iil.I00iiI;
                            olO0o02.I0000O++;
                            olO0o02.I0000oI00++;
                        }
                    }
/* 37 */            Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                }

                @Override
                public final boolean contains(Object obj) {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.contains(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.containsAll(collection);
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final Object get(int i) {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.get(i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.indexOf(obj);
                }

                @Override
                public final boolean isEmpty() {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             return listIterator();
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.lastIndexOf(obj);
                }

                @Override
                public final ListIterator listIterator() {
/* 4 */             return new Io1ioiIIO1lI(this, 0);
                }

                @Override
                public final boolean remove(Object obj) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 62 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    i = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 17 */                int iIndexOf = i01Io11IiiiO.indexOf(obj);
/* 29 */                I01Io11IiiiO i01Io11IiiiOI000o00OoI0I = iIndexOf != -1 ? i01Io11IiiiO.I000o00OoI0I(iIndexOf) : i01Io11IiiiO;
/* 34 */                if (i01Io11IiiiOI000o00OoI0I.equals(i01Io11IiiiO)) {
/* 36 */                    return false;
                        }
/* 38 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 43 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 54 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000o00OoI0I, true);
                        }
/* 59 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 62 */            } while (!zI00000oIO);
/* 53 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 63 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 12 */                    i = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 20 */                I01Io1 i01Io1 = new I01Io1(0);
/* 23 */                i01Io1.I00iiI = collection;
/* 25 */                VarHandle.storeStoreFence();
/* 28 */                I01Io11IiiiO i01Io11IiiiOI000lI = i01Io11IiiiO.I000lI(i01Io1);
/* 36 */                if (O0000Ioio00.I0000O(i01Io11IiiiOI000lI, i01Io11IiiiO)) {
/* 19 */                    return false;
                        }
/* 39 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 44 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 55 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000lI, true);
                        }
/* 60 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 63 */            } while (!zI00000oIO);
/* 54 */            return true;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 4 */             I01Io1 i01Io1 = new I01Io1(2);
/* 7 */             i01Io1.I00iiI = collection;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            return iO0oloi1IO0.I00000oOI(this, i01Io1);
                }

                @Override
                public final Object set(int i, Object obj) {
                    int i2;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 1 */             Object obj2 = get(i);
/* 56 */            do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 14 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 16 */                    i2 = olO0o0.I0000O;
/* 18 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 21 */                I01Io11IiiiO i01Io11IiiiOI000oI1ioi = i01Io11IiiiO.I000oI1ioi(i, obj);
/* 29 */                if (i01Io11IiiiOI000oI1ioi.equals(i01Io11IiiiO)) {
                            break;
                        }
/* 32 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 37 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 48 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i2, i01Io11IiiiOI000oI1ioi, false);
                        }
/* 53 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
/* 56 */            } while (!zI00000oIO);
/* 58 */            return obj2;
                }

                @Override
                public final int size() {
/* 11 */            return ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O.I00000oOI();
                }

                @Override
                public final List subList(int i, int i2) {
/* 14 */            if (!(i >= 0 && i <= i2 && i2 <= size())) {
/* 18 */                OO1oio00IO.I00000oIO("fromIndex or toIndex are out of bounds");
                    }
/* 23 */            return new Oli1i0O(this, i, i2);
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 33 */            return "SnapshotStateList(value=" + ((OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl)).I0000Il00O + ")@" + hashCode();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 9 */             I01Io11IiiiO i01Io11IiiiO = ((OlO0o0) Ol1l1lI1Ili.I0010o(this.I00iOIl, this)).I0000Il00O;
/* 11 */            int iI00000oOI = i01Io11IiiiO.I00000oOI();
/* 15 */            parcel.writeInt(iI00000oOI);
/* 19 */            for (int i2 = 0; i2 < iI00000oOI; i2++) {
/* 25 */                parcel.writeValue(i01Io11IiiiO.get(i2));
                    }
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }

                @Override
/* 7 */         public final ListIterator listIterator(int i) {
/* 8 */             return new Io1ioiIIO1lI(this, i);
                }

/* 32 */        public Ol1o0O0O0() {
/* 34 */            this(Ol1Iil.I00iiI);
                }

                @Override
/* 61 */        public final void add(int i, Object obj) {
                    int i2;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
                    do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 65 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 66 */                    i2 = olO0o0.I0000O;
/* 67 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 69 */                I01Io11IiiiO i01Io11IiiiOI0000O = i01Io11IiiiO.I0000O(i, obj);
/* 70 */                if (i01Io11IiiiOI0000O.equals(i01Io11IiiiO)) {
                            return;
                        }
/* 71 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 74 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 76 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i2, i01Io11IiiiOI0000O, true);
                        }
/* 78 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    } while (!zI00000oIO);
                }

                @Override
/* 61 */        public final boolean addAll(int i, Collection collection) {
/* 62 */            II1lIIolo iI1lIIolo = new II1lIIolo(2);
                    iI1lIIolo.I00iiI = i;
                    iI1lIIolo.I00iiO = collection;
                    VarHandle.storeStoreFence();
                    return iO0oloi1IO0.I00000oOI(this, iI1lIIolo);
                }

                @Override
/* 70 */        public final Object remove(int i) {
                    int i2;
                    I01Io11IiiiO i01Io11IiiiO;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 71 */            Object obj = get(i);
                    do {
                        synchronized (iO0oloi1IO0.I00000oIO) {
/* 75 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iOIl);
/* 76 */                    i2 = olO0o0.I0000O;
/* 77 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 79 */                I01Io11IiiiO i01Io11IiiiOI000o00OoI0I = i01Io11IiiiO.I000o00OoI0I(i);
/* 80 */                if (i01Io11IiiiOI000o00OoI0I.equals(i01Io11IiiiO)) {
                            break;
                        }
/* 81 */                OlO0o0 olO0o02 = this.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 84 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 86 */                    zI00000oIO = iO0oloi1IO0.I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, this, ol1il1o1I000O01llI0), i2, i01Io11IiiiOI000o00OoI0I, true);
                        }
/* 88 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, this);
                    } while (!zI00000oIO);
                    return obj;
                }
            }
