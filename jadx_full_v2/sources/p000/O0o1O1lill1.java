            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 8 */     public final class O0o1O1lill1 extends I01Iol implements O0o1ioOoo00, RandomAccess {
                public final ArrayList I00iiI;

                static {
/* 9 */             new O0o1O1lill1(10).I00iOIl = false;
                }

                public O0o1O1lill1(int i) {
/* 6 */             this(new ArrayList(i));
                }

                @Override
                public final List I00000oIO() {
/* 3 */             return Collections.unmodifiableList(this.I00iiI);
                }

                @Override
                public final Iool0o0iOI I000O01llI0(int i) {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 7 */             if (i < arrayList.size()) {
/* 23 */                OIiilo1Ool0o.I00100o1O0lo();
/* 26 */                return null;
                    }
/* 11 */            ArrayList arrayList2 = new ArrayList(i);
/* 14 */            arrayList2.addAll(arrayList);
/* 19 */            return new O0o1O1lill1(arrayList2);
                }

                @Override
                public final O0o1ioOoo00 I00100l0() {
                    return this.I00iOIl ? new OoiOo01(this) : this;
                }

                @Override
                public final void I00IioO0OiOi(IIOI1Ii1I iIOI1Ii1I) {
/* 1 */             I00000oOI();
/* 6 */             this.I00iiI.add(iIOI1Ii1I);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object I00iiI(int i) {
/* 3 */             return this.I00iiI.get(i);
                }

                @Override
                public final void add(int i, Object obj) {
/* 3 */             I00000oOI();
/* 8 */             this.I00iiI.add(i, (String) obj);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             I00000oOI();
/* 6 */             if (collection instanceof O0o1ioOoo00) {
/* 10 */                collection = ((O0o1ioOoo00) collection).I00000oIO();
                    }
/* 16 */            boolean zAddAll = this.I00iiI.addAll(i, collection);
                    ((AbstractList) this).modCount++;
/* 89 */            return zAddAll;
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
/* 6 */             this.I00iiI.clear();
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
                    String str;
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 3 */             Object obj = arrayList.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 16 */            if (!(obj instanceof IIOI1Ii1I)) {
/* 75 */                byte[] bArr = (byte[]) obj;
/* 81 */                String str2 = new String(bArr, Iool1iOO11.I00000oIO);
/* 92 */                if (Oolio1l.I00000oIO.I0000Il00O(bArr, 0, bArr.length)) {
/* 94 */                    arrayList.set(i, str2);
                        }
/* 186 */               return str2;
                    }
/* 18 */            IIOI1Ii1I iIOI1Ii1I = (IIOI1Ii1I) obj;
/* 20 */            Charset charset = Iool1iOO11.I00000oIO;
/* 26 */            if (iIOI1Ii1I.size() == 0) {
/* 28 */                str = "";
                    } else {
/* 32 */                IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 46 */                str = new String(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size(), charset);
                    }
/* 50 */            IIO1i10I iIO1i10I2 = (IIO1i10I) iIOI1Ii1I;
/* 52 */            int iI000iOII = iIO1i10I2.I000iOII();
/* 69 */            if (Oolio1l.I00000oIO.I0000Il00O(iIO1i10I2.I00iio, iI000iOII, iIO1i10I2.size() + iI000iOII)) {
/* 71 */                arrayList.set(i, str);
                    }
/* 74 */            return str;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             I00000oOI();
/* 6 */             Object objRemove = this.I00iiI.remove(i);
                    ((AbstractList) this).modCount++;
/* 18 */            if (objRemove instanceof String) {
/* 20 */                return (String) objRemove;
                    }
/* 25 */            if (!(objRemove instanceof IIOI1Ii1I)) {
/* 64 */                return new String((byte[]) objRemove, Iool1iOO11.I00000oIO);
                    }
/* 27 */            IIOI1Ii1I iIOI1Ii1I = (IIOI1Ii1I) objRemove;
/* 29 */            Charset charset = Iool1iOO11.I00000oIO;
/* 35 */            if (iIOI1Ii1I.size() == 0) {
/* 37 */                return "";
                    }
/* 40 */            IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 54 */            return new String(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size(), charset);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             I00000oOI();
/* 8 */             Object obj2 = this.I00iiI.set(i, (String) obj);
/* 14 */            if (obj2 instanceof String) {
/* 16 */                return (String) obj2;
                    }
/* 21 */            if (!(obj2 instanceof IIOI1Ii1I)) {
/* 60 */                return new String((byte[]) obj2, Iool1iOO11.I00000oIO);
                    }
/* 23 */            IIOI1Ii1I iIOI1Ii1I = (IIOI1Ii1I) obj2;
/* 25 */            Charset charset = Iool1iOO11.I00000oIO;
/* 31 */            if (iIOI1Ii1I.size() == 0) {
/* 33 */                return "";
                    }
/* 36 */            IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 50 */            return new String(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size(), charset);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiI.size();
                }

/* 9 */         public O0o1O1lill1(ArrayList arrayList) {
/* 11 */            this.I00iiI = arrayList;
                }

                @Override
/* 26 */        public final boolean addAll(Collection collection) {
/* 28 */            return addAll(this.I00iiI.size(), collection);
                }
            }
