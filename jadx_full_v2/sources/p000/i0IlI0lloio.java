            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class i0IlI0lloio implements Map, Serializable {
                public static final i0IlI0lloio I00io1l = new i0IlI0lloio(null, new Object[0], 0);
                public transient i0Il11IIol01 I00iOIl;
                public transient i0Il11lI10I I00iiI;
                public transient i0Il1lloiO I00iiO;
                public final transient Object I00iio;
                public final transient Object[] I00ilI0I1;
                public final transient int I00ilO0;

                public i0IlI0lloio(Object obj, Object[] objArr, int i) {
/* 4 */             this.I00iio = obj;
/* 6 */             this.I00ilI0I1 = objArr;
/* 8 */             this.I00ilO0 = i;
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
/* 1 */             i0Il1lloiO i0il1lloio = this.I00iiO;
/* 3 */             if (i0il1lloio == null) {
/* 12 */                i0il1lloio = new i0Il1lloiO(this.I00ilI0I1, 1, this.I00ilO0);
/* 15 */                this.I00iiO = i0il1lloio;
                    }
/* 17 */            return i0il1lloio.contains(obj);
                }

                @Override
                public final Set entrySet() {
/* 1 */             i0Il11IIol01 i0il11iiol01 = this.I00iOIl;
/* 3 */             if (i0il11iiol01 != null) {
/* 29 */                return i0il11iiol01;
                    }
/* 11 */            i0Il11IIol01 i0il11iiol012 = new i0Il11IIol01(this, this.I00ilI0I1, this.I00ilO0);
/* 14 */            this.I00iOIl = i0il11iiol012;
/* 29 */            return i0il11iiol012;
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

                /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
                /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(Object obj) {
                    Object obj2;
/* 2 */             if (obj == null) {
/* 4 */                 obj2 = null;
                    } else {
/* 8 */                 int i = this.I00ilO0;
/* 10 */                Object[] objArr = this.I00ilI0I1;
/* 12 */                if (i == 1) {
/* 15 */                    Object obj3 = objArr[0];
/* 17 */                    Objects.requireNonNull(obj3);
/* 24 */                    if (obj3.equals(obj)) {
/* 26 */                        obj2 = objArr[1];
/* 28 */                        Objects.requireNonNull(obj2);
                            }
                        } else {
/* 33 */                    Object obj4 = this.I00iio;
/* 35 */                    if (obj4 != null) {
/* 41 */                        if (obj4 instanceof byte[]) {
/* 44 */                            byte[] bArr = (byte[]) obj4;
                                    int length = bArr.length - 1;
/* 53 */                            int iI00000oIO = liIl1O0ollo.I00000oIO(obj.hashCode());
                                    while (true) {
/* 57 */                                int i2 = iI00000oIO & length;
/* 62 */                                int i3 = bArr[i2] & 255;
/* 63 */                                if (i3 == 255) {
                                            break;
                                        }
/* 72 */                                if (obj.equals(objArr[i3])) {
/* 76 */                                    obj2 = objArr[i3 ^ 1];
                                            break;
                                        }
/* 79 */                                iI00000oIO = i2 + 1;
                                    }
                                } else if (obj4 instanceof short[]) {
/* 87 */                            short[] sArr = (short[]) obj4;
                                    int length2 = sArr.length - 1;
/* 96 */                            int iI00000oIO2 = liIl1O0ollo.I00000oIO(obj.hashCode());
                                    while (true) {
/* 100 */                               int i4 = iI00000oIO2 & length2;
/* 103 */                               char c = (char) sArr[i4];
/* 107 */                               if (c == 65535) {
                                            break;
                                        }
/* 116 */                               if (obj.equals(objArr[c])) {
/* 120 */                                   obj2 = objArr[c ^ 1];
                                            break;
                                        }
/* 123 */                               iI00000oIO2 = i4 + 1;
                                    }
                                } else {
/* 126 */                           int[] iArr = (int[]) obj4;
                                    int length3 = iArr.length - 1;
/* 134 */                           int iI00000oIO3 = liIl1O0ollo.I00000oIO(obj.hashCode());
                                    while (true) {
/* 138 */                               int i5 = iI00000oIO3 & length3;
/* 139 */                               int i6 = iArr[i5];
/* 141 */                               if (i6 == -1) {
                                            break;
                                        }
/* 151 */                               if (obj.equals(objArr[i6])) {
/* 155 */                                   obj2 = objArr[i6 ^ 1];
                                            break;
                                        }
/* 161 */                               iI00000oIO3 = i5 + 1;
                                    }
                                }
                            }
                        }
                    }
/* 157 */           if (obj2 == null) {
/* 1 */                 return null;
                    }
/* 160 */           return obj2;
                }

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
/* 1 */             Object obj3 = get(obj);
                    return obj3 != null ? obj3 : obj2;
                }

                @Override
                public final int hashCode() {
/* 1 */             i0Il11IIol01 i0il11iiol01 = this.I00iOIl;
/* 3 */             if (i0il11iiol01 == null) {
/* 11 */                i0il11iiol01 = new i0Il11IIol01(this, this.I00ilI0I1, this.I00ilO0);
/* 14 */                this.I00iOIl = i0il11iiol01;
                    }
/* 16 */            Iterator it = i0il11iiol01.iterator();
/* 21 */            int iHashCode = 0;
/* 26 */            while (it.hasNext()) {
/* 28 */                Object next = it.next();
/* 40 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 113 */           return iHashCode;
                }

                @Override
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             i0Il11lI10I i0il11li10i = this.I00iiI;
/* 3 */             if (i0il11li10i != null) {
/* 113 */               return i0il11li10i;
                    }
/* 12 */            i0Il1lloiO i0il1lloio = new i0Il1lloiO(this.I00ilI0I1, 0, this.I00ilO0);
/* 17 */            i0Il11lI10I i0il11li10i2 = new i0Il11lI10I(0);
/* 20 */            i0il11li10i2.I00o0iI0io1 = this;
/* 22 */            i0il11li10i2.I00o0l1o1o0 = i0il1lloio;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            this.I00iiI = i0il11li10i2;
/* 29 */            return i0il11li10i2;
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

                @Override
                public final int size() {
/* 1 */             return this.I00ilO0;
                }

                public final String toString() {
/* 3 */             int i = this.I00ilO0;
/* 5 */             liO1lOO1oIO.I00000oIO(i, "size");
/* 22 */            StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
/* 27 */            sb.append('{');
/* 36 */            Iterator it = ((i0Il11IIol01) entrySet()).iterator();
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
/* 1 */             i0Il1lloiO i0il1lloio = this.I00iiO;
/* 3 */             if (i0il1lloio != null) {
/* 29 */                return i0il1lloio;
                    }
/* 12 */            i0Il1lloiO i0il1lloio2 = new i0Il1lloiO(this.I00ilI0I1, 1, this.I00ilO0);
/* 15 */            this.I00iiO = i0il1lloio2;
/* 29 */            return i0il1lloio2;
                }
            }
