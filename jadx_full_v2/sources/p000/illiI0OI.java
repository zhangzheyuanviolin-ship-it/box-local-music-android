            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 25 */    public final class illiI0OI extends iilOi0ioo1 implements RandomAccess, illlOI {
                public List I00iiI;

                static {
/* 9 */             new illiI0OI(false).I00iiI = Collections.EMPTY_LIST;
/* 11 */            VarHandle.storeStoreFence();
                }

                public illiI0OI(int i) {
/* 3 */             ArrayList arrayList = new ArrayList(i);
/* 7 */             super(true);
/* 10 */            this.I00iiI = arrayList;
                }

                @Override
                public final String get(int i) {
                    String str;
/* 1 */             List list = this.I00iiI;
/* 3 */             Object obj = list.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 17 */            if (!(obj instanceof iiooOi11li)) {
/* 65 */                byte[] bArr = (byte[]) obj;
/* 71 */                String str2 = new String(bArr, ililOO0.I00000oIO);
/* 74 */                i1O01Ill i1o01ill = l011IIO.I00000oIO;
/* 76 */                int length = bArr.length;
/* 77 */                i1o01ill.getClass();
/* 84 */                if (i1O01Ill.I000OiO(bArr, 0, length)) {
/* 86 */                    list.set(i, str2);
                        }
/* 168 */               return str2;
                    }
/* 19 */            iiooOi11li iioooi11li = (iiooOi11li) obj;
/* 21 */            Charset charset = ililOO0.I00000oIO;
/* 27 */            if (iioooi11li.I0000oI00() == 0) {
/* 29 */                str = "";
                    } else {
/* 40 */                str = new String(iioooi11li.I00iiI, 0, iioooi11li.I0000oI00(), charset);
                    }
/* 44 */            int iI0000oI00 = iioooi11li.I0000oI00();
/* 48 */            byte[] bArr2 = iioooi11li.I00iiI;
/* 52 */            l011IIO.I00000oIO.getClass();
/* 59 */            if (i1O01Ill.I000OiO(bArr2, 0, iI0000oI00)) {
/* 61 */                list.set(i, str);
                    }
/* 64 */            return str;
                }

                @Override
                public final void I00OOll1(iiooOi11li iioooi11li) {
/* 1 */             zza();
/* 6 */             this.I00iiI.add(iioooi11li);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final void add(int i, Object obj) {
/* 3 */             zza();
/* 8 */             this.I00iiI.add(i, (String) obj);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             zza();
/* 6 */             if (collection instanceof illlOI) {
/* 10 */                collection = ((illlOI) collection).zzh();
                    }
/* 16 */            boolean zAddAll = this.I00iiI.addAll(i, collection);
                    ((AbstractList) this).modCount++;
/* 37 */            return zAddAll;
                }

                @Override
                public final void clear() {
/* 1 */             zza();
/* 6 */             this.I00iiI.clear();
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 6 */             Object objRemove = this.I00iiI.remove(i);
                    ((AbstractList) this).modCount++;
/* 18 */            if (objRemove instanceof String) {
/* 20 */                return (String) objRemove;
                    }
/* 25 */            if (!(objRemove instanceof iiooOi11li)) {
/* 59 */                return new String((byte[]) objRemove, ililOO0.I00000oIO);
                    }
/* 27 */            iiooOi11li iioooi11li = (iiooOi11li) objRemove;
/* 29 */            Charset charset = ililOO0.I00000oIO;
/* 35 */            if (iioooi11li.I0000oI00() == 0) {
/* 37 */                return "";
                    }
/* 49 */            return new String(iioooi11li.I00iiI, 0, iioooi11li.I0000oI00(), charset);
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             zza();
/* 8 */             Object obj2 = this.I00iiI.set(i, (String) obj);
/* 14 */            if (obj2 instanceof String) {
/* 16 */                return (String) obj2;
                    }
/* 21 */            if (!(obj2 instanceof iiooOi11li)) {
/* 55 */                return new String((byte[]) obj2, ililOO0.I00000oIO);
                    }
/* 23 */            iiooOi11li iioooi11li = (iiooOi11li) obj2;
/* 25 */            Charset charset = ililOO0.I00000oIO;
/* 31 */            if (iioooi11li.I0000oI00() == 0) {
/* 33 */                return "";
                    }
/* 45 */            return new String(iioooi11li.I00iiI, 0, iioooi11li.I0000oI00(), charset);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiI.size();
                }

                @Override
                public final iliiiioo zzd(int i) {
/* 1 */             List list = this.I00iiI;
/* 7 */             if (i < list.size()) {
/* 26 */                OIiilo1Ool0o.I00100o1O0lo();
/* 29 */                return null;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(i);
/* 14 */            arrayList.addAll(list);
/* 20 */            illiI0OI illii0oi = new illiI0OI(true);
/* 23 */            illii0oi.I00iiI = arrayList;
/* 25 */            return illii0oi;
                }

                @Override
                public final illlOI zze() {
                    return this.I00iOIl ? new iooo000ioI(this) : this;
                }

                @Override
                public final Object zzf(int i) {
/* 3 */             return this.I00iiI.get(i);
                }

                @Override
                public final List zzh() {
/* 3 */             return Collections.unmodifiableList(this.I00iiI);
                }

                @Override
/* 26 */        public final boolean addAll(Collection collection) {
/* 28 */            return addAll(this.I00iiI.size(), collection);
                }
            }
