            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public abstract class OO11OlII1o {
                public final ArrayList I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;
                public I0OOO1l0IoO I0000O;
                private volatile Object interceptors$delegate;

                public OO11OlII1o(I0OOO1l0IoO... i0OOO1l0IoOArr) {
/* 4 */             iOOOillOoi0.I00000oIO();
/* 16 */            this.I00000oIO = IOOi1I.I000OiO(Arrays.copyOf(i0OOO1l0IoOArr, i0OOO1l0IoOArr.length));
/* 19 */            this.interceptors$delegate = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(Object obj, Object obj2, IOoilo iOoilo) {
                    Ii1OloIoolO1 ii1OloIoolO1;
                    int iI000II;
                    int iI000II2;
/* 1 */             Ii00l101O context = iOoilo.getContext();
/* 10 */            if (((List) this.interceptors$delegate) == null) {
/* 12 */                int i = this.I00000oOI;
/* 16 */                if (i == 0) {
/* 20 */                    this.interceptors$delegate = Il01100l.I00iOIl;
/* 22 */                    this.I0000Il00O = false;
/* 24 */                    this.I0000O = null;
                        } else {
/* 28 */                    ArrayList arrayList = this.I00000oIO;
/* 30 */                    if (i != 1 || (iI000II2 = IOOi1I.I000II(arrayList)) < 0) {
/* 82 */                        ArrayList arrayList2 = new ArrayList();
/* 85 */                        iI000II = IOOi1I.I000II(arrayList);
/* 89 */                        if (iI000II >= 0) {
/* 91 */                            int i2 = 0;
                                    while (true) {
/* 92 */                                Object obj3 = arrayList.get(i2);
/* 103 */                               OO10IoOII0 oO10IoOII0 = obj3 instanceof OO10IoOII0 ? (OO10IoOII0) obj3 : null;
/* 104 */                               if (oO10IoOII0 != null) {
/* 107 */                                   List list = oO10IoOII0.I0000Il00O;
/* 118 */                                   arrayList2.ensureCapacity(list.size() + arrayList2.size());
/* 121 */                                   int size = list.size();
/* 126 */                                   for (int i3 = 0; i3 < size; i3++) {
/* 132 */                                       arrayList2.add(list.get(i3));
                                            }
                                        }
/* 138 */                               if (i2 == iI000II) {
                                            break;
                                        }
/* 140 */                               i2++;
                                    }
                                }
/* 143 */                       this.interceptors$delegate = arrayList2;
/* 145 */                       this.I0000Il00O = false;
/* 147 */                       this.I0000O = null;
                            } else {
/* 38 */                        int i4 = 0;
                                while (true) {
/* 39 */                            Object obj4 = arrayList.get(i4);
/* 50 */                            OO10IoOII0 oO10IoOII02 = obj4 instanceof OO10IoOII0 ? (OO10IoOII0) obj4 : null;
/* 51 */                            if (oO10IoOII02 != null && !oO10IoOII02.I0000Il00O.isEmpty()) {
/* 62 */                                List list2 = oO10IoOII02.I0000Il00O;
/* 64 */                                oO10IoOII02.I0000O = true;
/* 66 */                                this.interceptors$delegate = list2;
/* 68 */                                this.I0000Il00O = false;
/* 72 */                                this.I0000O = oO10IoOII02.I00000oIO;
                                        break;
                                    }
/* 75 */                            if (i4 == iI000II2) {
                                        break;
                                    }
/* 77 */                            i4++;
                                }
/* 82 */                        ArrayList arrayList22 = new ArrayList();
/* 85 */                        iI000II = IOOi1I.I000II(arrayList);
/* 89 */                        if (iI000II >= 0) {
                                }
/* 143 */                       this.interceptors$delegate = arrayList22;
/* 145 */                       this.I0000Il00O = false;
/* 147 */                       this.I0000O = null;
                            }
                        }
                    }
/* 149 */           this.I0000Il00O = true;
/* 153 */           List list3 = (List) this.interceptors$delegate;
/* 155 */           boolean zI0000O = I0000O();
/* 161 */           if (OO11iOO.I00000oIO || zI0000O) {
/* 208 */               Ii1OloIoolO1 ii1OloIoolO12 = new Ii1OloIoolO1(obj);
/* 211 */               ii1OloIoolO12.I00iiI = list3;
/* 213 */               ii1OloIoolO12.I00iiO = context;
/* 215 */               ii1OloIoolO12.I00iio = obj2;
/* 217 */               VarHandle.storeStoreFence();
                        ii1OloIoolO1 = ii1OloIoolO12;
                    } else {
/* 168 */               Oll0i111 oll0i111 = new Oll0i111(obj);
/* 171 */               oll0i111.I00iiI = list3;
/* 175 */               Oll0OlI11 oll0OlI11 = new Oll0OlI11();
/* 178 */               oll0OlI11.I00iiI = oll0i111;
/* 182 */               oll0OlI11.I00iOIl = Integer.MIN_VALUE;
/* 184 */               VarHandle.storeStoreFence();
/* 187 */               oll0i111.I00iiO = oll0OlI11;
/* 189 */               oll0i111.I00iio = obj2;
/* 197 */               oll0i111.I00ilI0I1 = new IOoil1iiIilo[list3.size()];
/* 200 */               oll0i111.I00ilO0 = -1;
/* 202 */               VarHandle.storeStoreFence();
                        ii1OloIoolO1 = oll0i111;
                    }
/* 220 */           return ii1OloIoolO1.I00000oOI(obj2, iOoilo);
                }

                public final OO10IoOII0 I00000oOI(I0OOO1l0IoO i0OOO1l0IoO) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 10 */                Object obj = arrayList.get(i);
/* 14 */                if (obj == i0OOO1l0IoO) {
/* 20 */                    OO10IoOII0 oO10IoOII0 = new OO10IoOII0(i0OOO1l0IoO, OO11loi0.I00000oIO);
/* 23 */                    arrayList.set(i, oO10IoOII0);
/* 26 */                    return oO10IoOII0;
                        }
/* 29 */                if (obj instanceof OO10IoOII0) {
/* 31 */                    OO10IoOII0 oO10IoOII02 = (OO10IoOII0) obj;
/* 35 */                    if (oO10IoOII02.I00000oIO == i0OOO1l0IoO) {
/* 37 */                        return oO10IoOII02;
                            }
                        }
                    }
/* 41 */            return null;
                }

                public final int I0000Il00O(I0OOO1l0IoO i0OOO1l0IoO) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 10 */                Object obj = arrayList.get(i);
/* 14 */                if (obj == i0OOO1l0IoO || ((obj instanceof OO10IoOII0) && ((OO10IoOII0) obj).I00000oIO == i0OOO1l0IoO)) {
/* 30 */                    return i;
                        }
                    }
/* 31 */            return -1;
                }

                public abstract boolean I0000O();

                public final boolean I0000oI00(I0OOO1l0IoO i0OOO1l0IoO) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 3 */             int size = arrayList.size();
/* 9 */             for (int i = 0; i < size; i++) {
/* 11 */                Object obj = arrayList.get(i);
/* 15 */                if (obj == i0OOO1l0IoO) {
/* 31 */                    return true;
                        }
/* 19 */                if ((obj instanceof OO10IoOII0) && ((OO10IoOII0) obj).I00000oIO == i0OOO1l0IoO) {
/* 31 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                public final void I0001Ioi1lo(I0OOO1l0IoO i0OOO1l0IoO) {
/* 1 */             I0OOO1l0IoO i0OOO1l0IoO2 = IoO0l0Iiioll.I000lI;
/* 7 */             if (I0000oI00(i0OOO1l0IoO)) {
/* 9 */                 return;
                    }
/* 10 */            int iI0000Il00O = I0000Il00O(i0OOO1l0IoO2);
/* 16 */            if (iI0000Il00O == -1) {
/* 186 */               throw new I010l10O("Phase " + i0OOO1l0IoO2 + " was not registered for this pipeline", 1);
                    }
/* 18 */            int i = iI0000Il00O + 1;
/* 20 */            ArrayList arrayList = this.I00000oIO;
/* 22 */            int iI000II = IOOi1I.I000II(arrayList);
/* 26 */            if (i <= iI000II) {
                        while (true) {
/* 28 */                    Object obj = arrayList.get(i);
/* 40 */                    OO10IoOII0 oO10IoOII0 = obj instanceof OO10IoOII0 ? (OO10IoOII0) obj : null;
/* 41 */                    if (oO10IoOII0 == null) {
                                break;
                            }
/* 43 */                    lI0lIOoIO li0liooio = oO10IoOII0.I00000oOI;
/* 52 */                    if ((li0liooio instanceof OO11lO1 ? (OO11lO1) li0liooio : null) != null) {
/* 54 */                        iI0000Il00O = i;
                            }
/* 55 */                    if (i == iI000II) {
                                break;
                            } else {
/* 57 */                        i++;
                            }
                        }
                    }
/* 65 */            OO11lO1 oO11lO1 = new OO11lO1();
/* 68 */            VarHandle.storeStoreFence();
/* 74 */            arrayList.add(iI0000Il00O + 1, new OO10IoOII0(i0OOO1l0IoO, oO11lO1));
                }

                public final void I000II(I0OOO1l0IoO i0OOO1l0IoO, Function3 function3) {
/* 1 */             OO10IoOII0 oO10IoOII0I00000oOI = I00000oOI(i0OOO1l0IoO);
/* 6 */             if (oO10IoOII0I00000oOI == null) {
/* 551 */               throw new I010l10O("Phase " + i0OOO1l0IoO + " was not registered for this pipeline", 1);
                    }
/* 10 */            List list = (List) this.interceptors$delegate;
/* 19 */            if (!this.I00000oIO.isEmpty() && list != null && !this.I0000Il00O && (list instanceof List) && (!(list instanceof O0IlIoi) || (list instanceof O0IloI1o))) {
/* 46 */                if (O0000Ioio00.I0000O(this.I0000O, i0OOO1l0IoO)) {
/* 48 */                    list.add(function3);
                        } else if (i0OOO1l0IoO == IOOi0Ool1i.I00Io1o110i(this.I00000oIO) || I0000Il00O(i0OOO1l0IoO) == IOOi1I.I000II(this.I00000oIO)) {
/* 72 */                    OO10IoOII0 oO10IoOII0I00000oOI2 = I00000oOI(i0OOO1l0IoO);
/* 78 */                    if (oO10IoOII0I00000oOI2.I0000O) {
/* 89 */                        oO10IoOII0I00000oOI2.I0000Il00O = new ArrayList(oO10IoOII0I00000oOI2.I0000Il00O);
/* 91 */                        oO10IoOII0I00000oOI2.I0000O = false;
                            }
/* 95 */                    oO10IoOII0I00000oOI2.I0000Il00O.add(function3);
/* 98 */                    list.add(function3);
                        }
                        this.I00000oOI++;
/* 106 */               return;
                    }
/* 109 */           if (oO10IoOII0I00000oOI.I0000O) {
/* 120 */               oO10IoOII0I00000oOI.I0000Il00O = new ArrayList(oO10IoOII0I00000oOI.I0000Il00O);
/* 122 */               oO10IoOII0I00000oOI.I0000O = false;
                    }
/* 126 */           oO10IoOII0I00000oOI.I0000Il00O.add(function3);
                    this.I00000oOI++;
/* 135 */           this.interceptors$delegate = null;
/* 137 */           this.I0000Il00O = false;
/* 139 */           this.I0000O = null;
                }
            }
