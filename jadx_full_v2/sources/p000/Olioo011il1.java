            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public final class Olioo011il1 implements IOo1llI {
                public final int I00000oIO;
                public Object I00000oOI;

                public Olioo011il1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void accept(Object obj) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj2 = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 44 */                    I1lO00 i1lO00 = (I1lO00) obj;
/* 58 */                    for (Map.Entry entry : ((Map) obj2).entrySet()) {
/* 76 */                        int i2 = i1lO00.I00000oOI - ((I1l1llI1) entry.getKey()).I0001Ioi1lo;
/* 85 */                        if (((I1l1llI1) entry.getKey()).I000II) {
/* 87 */                            i2 = -i2;
                                }
/* 88 */                        int iI000OOo1O = OoI0lIiO.I000OOo1O(i2);
/* 96 */                        OlioOil olioOil = (OlioOil) entry.getValue();
/* 98 */                        olioOil.getClass();
/* 103 */                       Olio11 olio11 = new Olio11();
/* 106 */                       olio11.I00iOIl = olioOil;
/* 108 */                       olio11.I00iiI = iI000OOo1O;
/* 111 */                       olio11.I00iiO = -1;
/* 113 */                       VarHandle.storeStoreFence();
/* 116 */                       lOllIO.I0000Il00O(olio11);
                            }
                            break;
                        case 1:
/* 26 */                    IiI0oIlol0 iiI0oIlol0 = (IiI0oIlol0) obj2;
/* 33 */                    l11I11lO.I0000O(3, "SurfaceViewImpl");
/* 36 */                    if (iiI0oIlol0 != null) {
/* 38 */                        iiI0oIlol0.I00000oIO();
                                break;
                            }
                            break;
                        case 2:
/* 22 */                    ((IIiOOI) obj2).I00000oOI((I1lIoo) obj);
                            break;
                        default:
/* 14 */                    ((OOIoO0IIOO0) ((OOIoOo0O) obj2)).I000lI((i00lliOilOo) obj);
                            break;
                    }
                }
            }
