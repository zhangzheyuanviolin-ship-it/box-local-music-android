            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
/* 18 */    public abstract class Io000liOIo extends Io00OlOi0 {
                public final IlIO0iI10oI I00iOIl;

                public Io000liOIo() {
/* 6 */             IlIO0iI10oI ilIO0iI10oI = new IlIO0iI10oI();
/* 15 */            ilIO0iI10oI.I00000oIO = Ol1Io01IOiO.I000II(16);
/* 17 */            this.I00iOIl = ilIO0iI10oI;
                }

                public final boolean I000OOo1O() {
/* 3 */             Ol1Io01IOiO ol1Io01IOiO = this.I00iOIl.I00000oIO;
/* 6 */             int i = 0;
                    while (true) {
/* 13 */                if (i >= ol1Io01IOiO.I00iiI.size()) {
/* 37 */                    Iterator it = ol1Io01IOiO.I0000Il00O().iterator();
/* 45 */                    while (it.hasNext()) {
/* 57 */                        if (!IlIO0iI10oI.I0000oI00((Map.Entry) it.next())) {
                                }
                            }
/* 60 */                    return true;
                        }
/* 27 */                if (!IlIO0iI10oI.I0000oI00((Map.Entry) ol1Io01IOiO.I00iiI.get(i))) {
                            break;
                        }
/* 30 */                i++;
                    }
/* 5 */             return false;
                }

                public final int I000OiO() {
/* 3 */             Ol1Io01IOiO ol1Io01IOiO = this.I00iOIl.I00000oIO;
/* 6 */             int iI0000O = 0;
/* 13 */            for (int i = 0; i < ol1Io01IOiO.I00iiI.size(); i++) {
/* 21 */                Map.Entry entry = (Map.Entry) ol1Io01IOiO.I00iiI.get(i);
/* 37 */                iI0000O += IlIO0iI10oI.I0000O((Io0010Ill) entry.getKey(), entry.getValue());
                    }
/* 53 */            for (Map.Entry entry2 : ol1Io01IOiO.I0000Il00O()) {
/* 75 */                iI0000O += IlIO0iI10oI.I0000O((Io0010Ill) entry2.getKey(), entry2.getValue());
                    }
/* 113 */           return iI0000O;
                }

                public final Object I000iOII(Io00Iioo io00Iioo) {
/* 1 */             I00100l0(io00Iioo);
/* 4 */             Io0010Ill io0010Ill = io00Iioo.I0000O;
/* 10 */            Object obj = this.I00iOIl.I00000oIO.get(io0010Ill);
/* 14 */            if (obj == null) {
/* 16 */                return io00Iioo.I00000oOI;
                    }
/* 21 */            if (!io0010Ill.I00iiO) {
/* 62 */                return io00Iioo.I00000oIO(obj);
                    }
/* 29 */            if (io0010Ill.I00iiI.I00iOIl != i011loO.ENUM) {
/* 61 */                return obj;
                    }
/* 33 */            ArrayList arrayList = new ArrayList();
/* 38 */            Iterator it = ((List) obj).iterator();
/* 46 */            while (it.hasNext()) {
/* 56 */                arrayList.add(io00Iioo.I00000oIO(it.next()));
                    }
/* 60 */            return arrayList;
                }

                public final boolean I000l1(Io00Iioo io00Iioo) {
/* 1 */             I00100l0(io00Iioo);
/* 4 */             Io0010Ill io0010Ill = io00Iioo.I0000O;
/* 6 */             IlIO0iI10oI ilIO0iI10oI = this.I00iOIl;
/* 8 */             ilIO0iI10oI.getClass();
/* 14 */            if (!io0010Ill.I00iiO) {
                        return ilIO0iI10oI.I00000oIO.get(io0010Ill) != null;
                    }
/* 29 */            I000II.I000iOII("hasField() can only be called on non-repeated fields.");
/* 13 */            return false;
                }

                public final void I000lI() {
/* 3 */             this.I00iOIl.I0001Ioi1lo();
                }

                public final OlOO1i11110 I000o00OoI0I() {
/* 5 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(14);
/* 8 */             IlIO0iI10oI ilIO0iI10oI = this.I00iOIl;
/* 10 */            ilIO0iI10oI.getClass();
/* 21 */            Iterator it = ((I1IlioI1o1I) ilIO0iI10oI.I00000oIO.entrySet()).iterator();
/* 25 */            olOO1i11110.I00iiI = it;
/* 31 */            if (it.hasNext()) {
/* 39 */                olOO1i11110.I00iiO = (Map.Entry) it.next();
                    }
/* 41 */            VarHandle.storeStoreFence();
/* 113 */           return olOO1i11110;
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000oI1ioi(IOOOIOiO0io1 iOOOIOiO0io1, I1I1OO00o1o i1I1OO00o1o, Il1lll0iI il1lll0iI, int i) {
                    boolean z;
                    boolean z2;
                    Object objI0000Il00O;
                    I01Ilioliio i01Ilioliio;
/* 5 */             int i2 = i & 7;
/* 20 */            Io00Iioo io00Iioo = (Io00Iioo) il1lll0iI.I00000oIO.get(new Il1ll1110iiO(I00000oIO(), i >>> 3));
/* 24 */            if (io00Iioo == null) {
/* 26 */                z2 = true;
/* 27 */                z = false;
                    } else {
/* 29 */                Io0010Ill io0010Ill = io00Iioo.I0000O;
/* 31 */                i011io1o0i i011io1o0iVar = io0010Ill.I00iiI;
/* 33 */                IlIO0iI10oI ilIO0iI10oI = IlIO0iI10oI.I0000Il00O;
/* 37 */                if (i2 == i011io1o0iVar.I00iiI) {
/* 39 */                    z2 = false;
/* 40 */                    z = false;
                        } else if (io0010Ill.I00iiO && i011io1o0iVar.I00000oIO() && i2 == 2) {
/* 55 */                    z = true;
/* 56 */                    z2 = false;
                        }
                    }
/* 57 */            if (z2) {
/* 59 */                return iOOOIOiO0io1.I00100o1O0lo(i, i1I1OO00o1o);
                    }
/* 64 */            Ilooool1l0 ilooool1l0I0000O = null;
/* 65 */            IlIO0iI10oI ilIO0iI10oI2 = this.I00iOIl;
/* 67 */            if (z) {
/* 73 */                int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 77 */                Io0010Ill io0010Ill2 = io00Iioo.I0000O;
/* 83 */                if (io0010Ill2.I00iiI != i011io1o0i.I00io1l) {
/* 100 */                   while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 108 */                       ilIO0iI10oI2.I00000oIO(io0010Ill2, IlIO0iI10oI.I000O01llI0(iOOOIOiO0io1, io0010Ill2.I00iiI));
                            }
                        } else if (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 92 */                    iOOOIOiO0io1.I000iOII();
/* 95 */                    throw null;
                        }
/* 112 */               iOOOIOiO0io1.I0000O(iI0000oI00);
/* 22 */                return true;
                    }
/* 116 */           Io0010Ill io0010Ill3 = io00Iioo.I0000O;
/* 118 */           i011io1o0i i011io1o0iVar2 = io0010Ill3.I00iiI;
/* 120 */           boolean z3 = io0010Ill3.I00iiO;
/* 122 */           i011io1o0i i011io1o0iVar3 = io0010Ill3.I00iiI;
/* 126 */           int iOrdinal = i011io1o0iVar2.I00iOIl.ordinal();
/* 131 */           if (iOrdinal == 7) {
/* 248 */               iOOOIOiO0io1.I000iOII();
/* 483 */               throw null;
                    }
/* 135 */           if (iOrdinal != 8) {
/* 137 */               objI0000Il00O = IlIO0iI10oI.I000O01llI0(iOOOIOiO0io1, i011io1o0iVar3);
                    } else {
/* 142 */               if (!z3 && (i01Ilioliio = (I01Ilioliio) ilIO0iI10oI2.I00000oIO.get(io0010Ill3)) != null) {
/* 154 */                   ilooool1l0I0000O = i01Ilioliio.I0000oI00();
                        }
/* 158 */               if (ilooool1l0I0000O == null) {
/* 162 */                   ilooool1l0I0000O = io00Iioo.I0000Il00O.I0000O();
                        }
/* 168 */               if (i011io1o0iVar3 == i011io1o0i.I00ilI0I1) {
/* 170 */                   int i3 = io0010Ill3.I00iOIl;
/* 172 */                   iOOOIOiO0io1.I00000oOI();
                            iOOOIOiO0io1.I000OOo1O++;
/* 180 */                   ilooool1l0I0000O.I0000O(iOOOIOiO0io1, il1lll0iI);
/* 187 */                   iOOOIOiO0io1.I00000oIO((i3 << 3) | 4);
                            iOOOIOiO0io1.I000OOo1O--;
                        } else {
/* 196 */                   int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 200 */                   iOOOIOiO0io1.I00000oOI();
/* 203 */                   int iI0000oI002 = iOOOIOiO0io1.I0000oI00(iI000iOII);
                            iOOOIOiO0io1.I000OOo1O++;
/* 212 */                   ilooool1l0I0000O.I0000O(iOOOIOiO0io1, il1lll0iI);
/* 215 */                   iOOOIOiO0io1.I00000oIO(0);
                            iOOOIOiO0io1.I000OOo1O--;
/* 223 */                   iOOOIOiO0io1.I0000O(iI0000oI002);
                        }
/* 226 */               objI0000Il00O = ilooool1l0I0000O.I0000Il00O();
                    }
/* 230 */           if (z3) {
/* 236 */               ilIO0iI10oI2.I00000oIO(io0010Ill3, io00Iioo.I00000oOI(objI0000Il00O));
/* 22 */                return true;
                    }
/* 244 */           ilIO0iI10oI2.I000OOo1O(io0010Ill3, io00Iioo.I00000oOI(objI0000Il00O));
/* 22 */            return true;
                }

                public final void I00100l0(Io00Iioo io00Iioo) {
/* 7 */             if (io00Iioo.I00000oIO == I00000oIO()) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I000iOII("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }

/* 19 */        public Io000liOIo(Io000lII0l io000lII0l) {
/* 22 */            io000lII0l.I00iiI.I0001Ioi1lo();
/* 23 */            io000lII0l.I00iiO = false;
/* 25 */            this.I00iOIl = io000lII0l.I00iiI;
                }
            }
