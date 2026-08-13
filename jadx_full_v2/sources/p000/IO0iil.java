            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class IO0iil extends I01Io001O {
                public final int I00iOIl;
                public final IO0l0Il0lO0 I00iiI;

                public IO0iil(IO0l0Il0lO0 iO0l0Il0lO0, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iO0l0Il0lO0;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IO0l0Il0lO0 iO0l0Il0lO0 = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return iO0l0Il0lO0.I00iiO;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
                        default:
/* 15 */                    throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    if (OoOOI1100oI0.I0000oI00(obj)) {
/* 30 */                        return super.contains((Map.Entry) obj);
                            }
/* 3 */                     return false;
                        default:
/* 9 */                     if (!(obj instanceof String)) {
/* 3 */                         return false;
                            }
/* 16 */                    return this.I00iiI.containsKey((String) obj);
                    }
                }

                @Override
                public final Iterator iterator() {
                    int i;
                    int i2;
/* 1 */             int i3 = this.I00iOIl;
/* 3 */             IO0l0Il0lO0 iO0l0Il0lO0 = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 48 */                    IO0iOo iO0iOo = new IO0iOo(0);
/* 51 */                    iO0iOo.I00iio = iO0l0Il0lO0;
                            while (true) {
/* 53 */                        int i4 = iO0iOo.I00iiI;
/* 55 */                        IO0l0Il0lO0 iO0l0Il0lO02 = iO0iOo.I00iio;
/* 59 */                        if (i4 < iO0l0Il0lO02.I00ilI0I1 && ((i = iO0l0Il0lO02.I00iio[i4]) < 0 || iO0l0Il0lO02.I00iOIl[i] == null)) {
/* 75 */                            iO0iOo.I00iiI = i4 + 1;
                                }
                            }
/* 78 */                    VarHandle.storeStoreFence();
/* 81 */                    return iO0iOo;
                        default:
/* 11 */                    IO0iOo iO0iOo2 = new IO0iOo(1);
/* 14 */                    iO0iOo2.I00iio = iO0l0Il0lO0;
                            while (true) {
/* 16 */                        int i5 = iO0iOo2.I00iiI;
/* 18 */                        IO0l0Il0lO0 iO0l0Il0lO03 = iO0iOo2.I00iio;
/* 22 */                        if (i5 < iO0l0Il0lO03.I00ilI0I1 && ((i2 = iO0l0Il0lO03.I00iio[i5]) < 0 || iO0l0Il0lO03.I00iOIl[i2] == null)) {
/* 38 */                            iO0iOo2.I00iiI = i5 + 1;
                                }
                            }
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    return iO0iOo2;
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 28 */                    if (OoOOI1100oI0.I0000oI00(obj)) {
/* 33 */                        return super.remove((Map.Entry) obj);
                            }
/* 3 */                     return false;
                        default:
/* 9 */                     if (obj instanceof String) {
                                return this.I00iiI.remove((String) obj) != null;
                            }
/* 3 */                     return false;
                    }
                }
            }
