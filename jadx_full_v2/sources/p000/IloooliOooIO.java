            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            
            public abstract class IloooliOooIO implements Cloneable {
                public final Io00Ol1o10O I00iOIl;
                public Io00Ol1o10O I00iiI;

                public IloooliOooIO(Io00Ol1o10O io00Ol1o10O) {
/* 4 */             this.I00iOIl = io00Ol1o10O;
/* 10 */            if (io00Ol1o10O.I000OOo1O()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 49 */                throw null;
                    }
/* 16 */            this.I00iiI = io00Ol1o10O.I000lI();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I00000oIO(Iterable iterable, Iool1IOO1o0i iool1IOO1o0i) {
/* 1 */             byte[] bArr = Iool1iioooil.I00000oIO;
/* 3 */             iterable.getClass();
/* 10 */            if (iterable instanceof O0o1l10iOII) {
/* 14 */                List listI00000oIO = ((O0o1l10iOII) iterable).I00000oIO();
/* 18 */                IIlIOloOOO.I001i1lo1io(iool1IOO1o0i);
/* 21 */                iool1IOO1o0i.size();
/* 24 */                Iterator it = listI00000oIO.iterator();
/* 32 */                if (it.hasNext()) {
/* 34 */                    Object next = it.next();
/* 38 */                    next.getClass();
/* 43 */                    if (next instanceof IIO1i00loOo) {
/* 68 */                        throw null;
                            }
/* 47 */                    if (!(next instanceof byte[])) {
/* 67 */                        throw null;
                            }
/* 49 */                    byte[] bArr2 = (byte[]) next;
                            try {
/* 52 */                        IIO1i00loOo.I0000O(bArr2, 0, bArr2.length);
/* 55 */                        throw null;
                            } catch (O0010I0o e) {
/* 64 */                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                            }
                        }
/* 551 */               return;
                    }
/* 71 */            if (iterable instanceof OOIi1oI1loI) {
/* 75 */                iool1IOO1o0i.addAll((Collection) iterable);
/* 78 */                return;
                    }
/* 81 */            if (iterable instanceof Collection) {
/* 86 */                int size = ((Collection) iterable).size();
/* 92 */                if (iool1IOO1o0i instanceof ArrayList) {
/* 102 */                   ((ArrayList) iool1IOO1o0i).ensureCapacity(iool1IOO1o0i.size() + size);
                        } else if (iool1IOO1o0i instanceof OOiI0I0I) {
/* 111 */                   OOiI0I0I oOiI0I0I = (OOiI0I0I) iool1IOO1o0i;
/* 115 */                   int i = oOiI0I0I.I00iiO + size;
/* 116 */                   Object[] objArr = oOiI0I0I.I00iiI;
/* 119 */                   if (i > objArr.length) {
/* 125 */                       if (objArr.length == 0) {
/* 133 */                           oOiI0I0I.I00iiI = new Object[Math.max(i, 10)];
                                } else {
/* 136 */                           int length = objArr.length;
/* 137 */                           while (length < i) {
/* 142 */                               length = OooioIOo1.I000II(length, 3, 2, 1, 10);
                                    }
/* 153 */                           oOiI0I0I.I00iiI = Arrays.copyOf(oOiI0I0I.I00iiI, length);
                                }
                            }
                        }
                    }
/* 155 */           int size2 = iool1IOO1o0i.size();
/* 161 */           if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
/* 199 */               for (Object obj : iterable) {
/* 205 */                   if (obj == null) {
/* 211 */                       I0001Ioi1lo(size2, iool1IOO1o0i);
/* 214 */                       throw null;
                            }
/* 207 */                   iool1IOO1o0i.add(obj);
                        }
/* 551 */               return;
                    }
/* 167 */           List list = (List) iterable;
/* 169 */           int size3 = list.size();
/* 173 */           for (int i2 = 0; i2 < size3; i2++) {
/* 175 */               Object obj2 = list.get(i2);
/* 179 */               if (obj2 == null) {
/* 187 */                   I0001Ioi1lo(size2, iool1IOO1o0i);
/* 190 */                   throw null;
                        }
/* 181 */               iool1IOO1o0i.add(obj2);
                    }
                }

                public static void I0000oI00(Object obj, Object obj2) {
/* 1 */             OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 3 */             oOi1o101lI.getClass();
/* 14 */            oOi1o101lI.I00000oIO(obj.getClass()).I00000oIO(obj, obj2);
                }

                public static void I0001Ioi1lo(int i, List list) {
/* 21 */            String str = "Element at index " + (list.size() - i) + " is null.";
/* 31 */            for (int size = list.size() - 1; size >= i; size--) {
/* 33 */                list.remove(size);
                    }
/* 89 */            throw new NullPointerException(str);
                }

                public final Io00Ol1o10O I00000oOI() {
/* 1 */             Io00Ol1o10O io00Ol1o10OI0000Il00O = I0000Il00O();
/* 5 */             io00Ol1o10OI0000Il00O.getClass();
/* 13 */            if (Io00Ol1o10O.I000O01llI0(io00Ol1o10OI0000Il00O, true)) {
/* 15 */                return io00Ol1o10OI0000Il00O;
                    }
/* 29 */            throw new OoiII1I11l();
                }

                public final Io00Ol1o10O I0000Il00O() {
/* 3 */             boolean zI000OOo1O = this.I00iiI.I000OOo1O();
/* 7 */             Io00Ol1o10O io00Ol1o10O = this.I00iiI;
/* 9 */             if (!zI000OOo1O) {
/* 11 */                return io00Ol1o10O;
                    }
/* 12 */            io00Ol1o10O.I000OiO();
/* 15 */            return this.I00iiI;
                }

                public final void I0000O() {
/* 7 */             if (this.I00iiI.I000OOo1O()) {
/* 29 */                return;
                    }
/* 11 */            Io00Ol1o10O io00Ol1o10OI000lI = this.I00iOIl.I000lI();
/* 17 */            I0000oI00(io00Ol1o10OI000lI, this.I00iiI);
/* 20 */            this.I00iiI = io00Ol1o10OI000lI;
                }

                public final Object clone() {
/* 8 */             IloooliOooIO iloooliOooIO = (IloooliOooIO) this.I00iOIl.I0000oI00(5);
/* 14 */            iloooliOooIO.I00iiI = I0000Il00O();
/* 29 */            return iloooliOooIO;
                }
            }
