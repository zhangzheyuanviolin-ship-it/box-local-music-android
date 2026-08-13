            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class iOlloIll11 implements Map, Serializable {
                public transient iiIiIlIo0 I00iOIl;
                public transient iiIlllo0Oi I00iiI;
                public transient iiO000il1Io I00iiO;

                @Override
                public final iOo0iiol entrySet() {
/* 1 */             iiIiIlIo0 iiiiilio0 = this.I00iOIl;
/* 3 */             if (iiiiilio0 != null) {
/* 113 */               return iiiiilio0;
                    }
/* 6 */             iiO111IOo iio111ioo = (iiO111IOo) this;
/* 11 */            iiIiIlIo0 iiiiilio02 = new iiIiIlIo0(5);
/* 14 */            iiiiilio02.I00o0iI0io1 = iio111ioo;
/* 18 */            iiiiilio02.I00o0l1o1o0 = iio111ioo.I00ilI0I1;
/* 22 */            iiiiilio02.I00o101lO = iio111ioo.I00ilO0;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I00iOIl = iiiiilio02;
/* 29 */            return iiiiilio02;
                }

                @Override
                public final void clear() {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return get(obj) != null;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 1 */             iiO000il1Io iio000il1io = this.I00iiO;
/* 3 */             if (iio000il1io == null) {
/* 6 */                 iiO111IOo iio111ioo = (iiO111IOo) this;
/* 15 */                iiO000il1Io iio000il1io2 = new iiO000il1Io(iio111ioo.I00ilI0I1, 1, iio111ioo.I00ilO0);
/* 18 */                this.I00iiO = iio000il1io2;
/* 20 */                iio000il1io = iio000il1io2;
                    }
/* 21 */            return iio000il1io.contains(obj);
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Map) {
/* 21 */                return entrySet().equals(((Map) obj).entrySet());
                    }
/* 9 */             return false;
                }

                @Override
                public abstract Object get(Object obj);

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override
                public final int hashCode() {
/* 5 */             Iterator it = entrySet().iterator();
/* 10 */            int iHashCode = 0;
/* 15 */            while (it.hasNext()) {
/* 17 */                Object next = it.next();
/* 29 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 113 */           return iHashCode;
                }

                @Override
                public final boolean isEmpty() {
                    return ((iiO111IOo) this).size() == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             iiIlllo0Oi iiilllo0oi = this.I00iiI;
/* 3 */             if (iiilllo0oi != null) {
/* 113 */               return iiilllo0oi;
                    }
/* 6 */             iiO111IOo iio111ioo = (iiO111IOo) this;
/* 15 */            iiO000il1Io iio000il1io = new iiO000il1Io(iio111ioo.I00ilI0I1, 0, iio111ioo.I00ilO0);
/* 21 */            iiIlllo0Oi iiilllo0oi2 = new iiIlllo0Oi(5);
/* 24 */            iiilllo0oi2.I00o0iI0io1 = iio111ioo;
/* 26 */            iiilllo0oi2.I00o0l1o1o0 = iio000il1io;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            this.I00iiI = iiilllo0oi2;
/* 33 */            return iiilllo0oi2;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 89 */            throw new UnsupportedOperationException();
                }

                @Override
                public final void putAll(Map map) {
/* 49 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object remove(Object obj) {
/* 49 */            throw new UnsupportedOperationException();
                }

                public final String toString() {
/* 4 */             int i = ((iiO111IOo) this).I00ilO0;
/* 6 */             if (i < 0) {
/* 83 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "size cannot be negative but was: "));
/* 86 */                return null;
                    }
/* 22 */            StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
/* 27 */            sb.append('{');
/* 36 */            Iterator it = ((iiIiIlIo0) entrySet()).iterator();
/* 40 */            boolean z = true;
/* 45 */            while (it.hasNext()) {
/* 51 */                Map.Entry entry = (Map.Entry) it.next();
/* 53 */                if (!z) {
/* 57 */                    sb.append(", ");
                        }
/* 62 */                OooioIOo1.I00111O(entry, sb, '=');
/* 65 */                z = false;
                    }
/* 69 */            sb.append('}');
/* 72 */            return sb.toString();
                }

                @Override
                public final Collection values() {
/* 1 */             iiO000il1Io iio000il1io = this.I00iiO;
/* 3 */             if (iio000il1io != null) {
/* 29 */                return iio000il1io;
                    }
/* 6 */             iiO111IOo iio111ioo = (iiO111IOo) this;
/* 15 */            iiO000il1Io iio000il1io2 = new iiO000il1Io(iio111ioo.I00ilI0I1, 1, iio111ioo.I00ilO0);
/* 18 */            this.I00iiO = iio000il1io2;
/* 20 */            return iio000il1io2;
                }
            }
