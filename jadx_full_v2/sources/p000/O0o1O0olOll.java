            package p000;

            import java.io.UnsupportedEncodingException;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            
/* 17 */    public final class O0o1O0olOll extends AbstractList implements RandomAccess, O0o1lIo {
                public static final OoiOo0 I00iiI = new OoiOo0(new O0o1O0olOll());
                public final ArrayList I00iOIl;

                public O0o1O0olOll(O0o1lIo o0o1lIo) {
/* 13 */            this.I00iOIl = new ArrayList(o0o1lIo.size());
/* 15 */            addAll(o0o1lIo);
                }

                @Override
                public final List I00000oIO() {
/* 3 */             return Collections.unmodifiableList(this.I00iOIl);
                }

                @Override
                public final OoiOo0 I00100l0() {
/* 3 */             return new OoiOo0(this);
                }

                @Override
                public final IIOII1 I00IoiI(int i) {
                    IIOII1 o1101ooIo0l;
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 3 */             Object obj = arrayList.get(i);
/* 9 */             if (obj instanceof IIOII1) {
/* 12 */                o1101ooIo0l = (IIOII1) obj;
                    } else if (obj instanceof String) {
                        try {
/* 30 */                    o1101ooIo0l = new O1101ooIo0l(((String) obj).getBytes("UTF-8"));
                        } catch (UnsupportedEncodingException e) {
/* 38 */                    OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 41 */                    return null;
                        }
                    } else {
/* 44 */                byte[] bArr = (byte[]) obj;
/* 46 */                int length = bArr.length;
/* 47 */                byte[] bArr2 = new byte[length];
/* 50 */                System.arraycopy(bArr, 0, bArr2, 0, length);
/* 55 */                o1101ooIo0l = new O1101ooIo0l(bArr2);
                    }
/* 58 */            if (o1101ooIo0l != obj) {
/* 60 */                arrayList.set(i, o1101ooIo0l);
                    }
/* 186 */           return o1101ooIo0l;
                }

                @Override
                public final void I00Ol00(O1101ooIo0l o1101ooIo0l) {
/* 3 */             this.I00iOIl.add(o1101ooIo0l);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final void add(int i, Object obj) {
/* 5 */             this.I00iOIl.add(i, (String) obj);
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 3 */             if (collection instanceof O0o1lIo) {
/* 7 */                 collection = ((O0o1lIo) collection).I00000oIO();
                    }
/* 13 */            boolean zAddAll = this.I00iOIl.addAll(i, collection);
                    ((AbstractList) this).modCount++;
/* 89 */            return zAddAll;
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 3 */             Object obj = arrayList.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 16 */            if (obj instanceof IIOII1) {
/* 18 */                IIOII1 iioii1 = (IIOII1) obj;
/* 20 */                String strI0010o = iioii1.I0010o();
/* 28 */                if (iioii1.I000iOII()) {
/* 30 */                    arrayList.set(i, strI0010o);
                        }
/* 33 */                return strI0010o;
                    }
/* 34 */            byte[] bArr = (byte[]) obj;
/* 36 */            byte[] bArr2 = IoolI10lO0ol.I00000oIO;
                    try {
/* 42 */                String str = new String(bArr, "UTF-8");
/* 51 */                if (li0lloi1l.I0000Il00O(bArr, 0, bArr.length) == 0) {
/* 53 */                    arrayList.set(i, str);
                        }
/* 56 */                return str;
                    } catch (UnsupportedEncodingException e) {
/* 60 */                OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 63 */                return null;
                    }
                }

                @Override
                public final Object remove(int i) {
/* 3 */             Object objRemove = this.I00iOIl.remove(i);
                    ((AbstractList) this).modCount++;
/* 15 */            if (objRemove instanceof String) {
/* 17 */                return (String) objRemove;
                    }
/* 22 */            if (objRemove instanceof IIOII1) {
/* 26 */                return ((IIOII1) objRemove).I0010o();
                    }
/* 31 */            byte[] bArr = (byte[]) objRemove;
/* 33 */            byte[] bArr2 = IoolI10lO0ol.I00000oIO;
                    try {
/* 39 */                return new String(bArr, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
/* 46 */                OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 49 */                return null;
                    }
                }

                @Override
                public final Object set(int i, Object obj) {
/* 5 */             Object obj2 = this.I00iOIl.set(i, (String) obj);
/* 11 */            if (obj2 instanceof String) {
/* 13 */                return (String) obj2;
                    }
/* 18 */            if (obj2 instanceof IIOII1) {
/* 22 */                return ((IIOII1) obj2).I0010o();
                    }
/* 27 */            byte[] bArr = (byte[]) obj2;
/* 29 */            byte[] bArr2 = IoolI10lO0ol.I00000oIO;
                    try {
/* 35 */                return new String(bArr, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
/* 42 */                OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 45 */                return null;
                    }
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

/* 18 */        public O0o1O0olOll() {
/* 20 */            this.I00iOIl = new ArrayList();
                }

                @Override
/* 23 */        public final boolean addAll(Collection collection) {
/* 25 */            return addAll(this.I00iOIl.size(), collection);
                }
            }
