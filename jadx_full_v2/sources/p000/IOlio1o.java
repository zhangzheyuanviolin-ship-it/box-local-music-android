            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOlio1o implements IllOOo00lI {
                public final int I00iOIl;
                public String I00iiI;
                public OI10i0Il I00iiO;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 81 */                    this.I00iiO.setValue(this.I00iiI);
                            break;
                        case 1:
/* 16 */                    String str = this.I00iiI;
/* 18 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 61 */                    if ((str.equals("PrimaryNotEditable") || str.equals("PrimaryEditable")) ? true : str.equals("SecondaryEditable") ? ((Il1Oio0I) oI10i0Il.getValue()).I00000oIO.equals("SecondaryEditable") : false) {
/* 65 */                        Il1Oio0I il1Oio0I = new Il1Oio0I();
/* 68 */                        il1Oio0I.I00000oIO = str;
/* 70 */                        VarHandle.storeStoreFence();
/* 73 */                        oI10i0Il.setValue(il1Oio0I);
                                break;
                            }
                            break;
                        default:
/* 12 */                    this.I00iiO.setValue(this.I00iiI);
                            break;
                    }
/* 15 */            return ooiIlOl1iI;
                }
            }
