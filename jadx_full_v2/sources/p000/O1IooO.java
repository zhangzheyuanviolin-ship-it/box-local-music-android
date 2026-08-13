            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class O1IooO {
                public final ArrayList I00000oIO = new ArrayList();

                public O1IooO(O1IoOOii0Ioi... o1IoOOii0IoiArr) {
/* 13 */            for (O1IoOOii0Ioi o1IoOOii0Ioi : o1IoOOii0IoiArr) {
/* 19 */                this.I00000oIO.add(o1IoOOii0Ioi);
                    }
                }

                public final void I00000oIO(O1IoOOii0Ioi o1IoOOii0Ioi) {
/* 1 */             if (o1IoOOii0Ioi == null) {
/* 3 */                 return;
                    }
/* 4 */             O1IoiiO0o1 o1IoiiO0o1 = o1IoOOii0Ioi.I00000oIO;
/* 8 */             if (o1IoiiO0o1 != O1IoiiO0o1.I00oII) {
/* 12 */                this.I00000oIO.add(o1IoOOii0Ioi);
                    } else {
/* 18 */                O1IoOOii0Ioi.I000O01llI0.getClass();
/* 49 */                throw new O1Ooo1IIioo(IlIi0I0.I000lI("Cannot add atom of type ", IIlOoolol0ll.I0010I0i(o1IoiiO0o1), " in a mathList "));
                    }
                }

                public final O1IooO I00000oOI() {
/* 6 */             O1IooO o1IooO = new O1IooO(new O1IoOOii0Ioi[0]);
/* 11 */            Iterator it = this.I00000oIO.iterator();
/* 19 */            while (it.hasNext()) {
/* 31 */                o1IooO.I00000oIO(((O1IoOOii0Ioi) it.next()).I00000oIO());
                    }
/* 113 */           return o1IooO;
                }

                public final O1IooO I0000Il00O() throws O1Ooo1IIioo {
                    O1IoiiO0o1 o1IoiiO0o1;
                    int i;
/* 6 */             O1IooO o1IooO = new O1IooO(new O1IoOOii0Ioi[0]);
/* 11 */            Iterator it = this.I00000oIO.iterator();
/* 15 */            O1IoOOii0Ioi o1IoOOii0Ioi = null;
/* 20 */            while (it.hasNext()) {
/* 26 */                O1IoOOii0Ioi o1IoOOii0Ioi2 = (O1IoOOii0Ioi) it.next();
/* 28 */                O1IoOOii0Ioi o1IoOOii0IoiI0000Il00O = o1IoOOii0Ioi2.I0000Il00O();
/* 32 */                OI1IO0IiiI oI1IO0IiiI = o1IoOOii0Ioi2.I000II;
/* 36 */                if (oI1IO0IiiI.I00000oIO == 0 && oI1IO0IiiI.I00000oOI == 0) {
/* 42 */                    if (o1IoOOii0Ioi == null) {
/* 44 */                        i = 0;
                            } else {
/* 46 */                        OI1IO0IiiI oI1IO0IiiI2 = o1IoOOii0Ioi.I000II;
/* 52 */                        i = oI1IO0IiiI2.I00000oIO + oI1IO0IiiI2.I00000oOI;
                            }
/* 59 */                    o1IoOOii0IoiI0000Il00O.I000II = new OI1IO0IiiI(i, 1);
                        }
/* 63 */                int iOrdinal = o1IoOOii0IoiI0000Il00O.I00000oIO.ordinal();
/* 68 */                if (iOrdinal != 2) {
/* 71 */                    if (iOrdinal == 5) {
/* 100 */                       O1IoOOii0Ioi.I000O01llI0.getClass();
/* 103 */                       if (o1IoOOii0Ioi == null || (o1IoiiO0o1 = o1IoOOii0Ioi.I00000oIO) == O1IoiiO0o1.I00ilO0 || o1IoiiO0o1 == O1IoiiO0o1.I00ioIO || o1IoiiO0o1 == O1IoiiO0o1.I00l0I0l0lO1 || o1IoiiO0o1 == O1IoiiO0o1.I00lli11 || o1IoiiO0o1 == O1IoiiO0o1.I00ilI0I1) {
/* 130 */                           o1IoOOii0IoiI0000Il00O.I00000oIO = O1IoiiO0o1.I00io1l;
                                }
                            } else if ((iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 12) && o1IoOOii0Ioi != null && o1IoOOii0Ioi.I00000oIO == O1IoiiO0o1.I00ilO0) {
/* 95 */                        o1IoOOii0Ioi.I00000oIO = O1IoiiO0o1.I00io1l;
                            }
                        } else if (o1IoOOii0Ioi != null && o1IoOOii0Ioi.I00000oIO == O1IoiiO0o1.I00iiO && o1IoOOii0Ioi.I0000O == null && o1IoOOii0Ioi.I0000Il00O == null) {
/* 149 */                   o1IoOOii0Ioi.I0000oI00(o1IoOOii0IoiI0000Il00O);
                        }
/* 154 */               o1IooO.I00000oIO(o1IoOOii0IoiI0000Il00O);
/* 157 */               o1IoOOii0Ioi = o1IoOOii0IoiI0000Il00O;
                    }
/* 160 */           if (o1IoOOii0Ioi != null && o1IoOOii0Ioi.I00000oIO == O1IoiiO0o1.I00ilO0) {
/* 170 */               o1IoOOii0Ioi.I00000oIO = O1IoiiO0o1.I00io1l;
                    }
/* 541 */           return o1IooO;
                }

                public final void I0000O(O1IoOOii0Ioi o1IoOOii0Ioi) throws O1Ooo1IIioo {
/* 1 */             O1IoiiO0o1 o1IoiiO0o1 = o1IoOOii0Ioi.I00000oIO;
/* 5 */             if (o1IoiiO0o1 != O1IoiiO0o1.I00oII) {
/* 10 */                this.I00000oIO.add(0, o1IoOOii0Ioi);
                    } else {
/* 16 */                O1IoOOii0Ioi.I000O01llI0.getClass();
/* 49 */                throw new O1Ooo1IIioo(IlIi0I0.I000lI("Cannot add atom of type ", IIlOoolol0ll.I0010I0i(o1IoiiO0o1), " in a mathList "));
                    }
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                sb.append(((O1IoOOii0Ioi) it.next()).toString());
                    }
/* 32 */            return sb.toString();
                }
            }
