            package p000;

            import androidx.work.impl.WorkDatabase;
            import java.lang.invoke.VarHandle;
            
            public final class IIoOlIoO implements IllOOo00lI {
                public final int I00iOIl;
                public String I00iiI;
                public i01IlOO I00iiO;

                public IIoOlIoO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 42 */                    i01IlOO i01iloo = this.I00iiO;
/* 44 */                    String str = this.I00iiI;
/* 46 */                    WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 51 */                    IIoOlOliI1 iIoOlOliI1 = new IIoOlOliI1(1);
/* 54 */                    iIoOlOliI1.I00iiI = workDatabase;
/* 56 */                    iIoOlOliI1.I00iiO = str;
/* 58 */                    iIoOlOliI1.I00iio = i01iloo;
/* 60 */                    VarHandle.storeStoreFence();
/* 63 */                    workDatabase.I0010I0i(iIoOlOliI1);
/* 70 */                    OiOIOI.I00000oOI(i01iloo.I00000oOI, workDatabase, i01iloo.I0000oI00);
                            break;
                        default:
/* 8 */                     String str2 = this.I00iiI;
/* 10 */                    i01IlOO i01iloo2 = this.I00iiO;
/* 12 */                    WorkDatabase workDatabase2 = i01iloo2.I0000Il00O;
/* 17 */                    IIoOlOliI1 iIoOlOliI12 = new IIoOlOliI1(0);
/* 20 */                    iIoOlOliI12.I00iiI = workDatabase2;
/* 22 */                    iIoOlOliI12.I00iiO = str2;
/* 24 */                    iIoOlOliI12.I00iio = i01iloo2;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    workDatabase2.I0010I0i(iIoOlOliI12);
/* 38 */                    OiOIOI.I00000oOI(i01iloo2.I00000oOI, i01iloo2.I0000Il00O, i01iloo2.I0000oI00);
                            break;
                    }
/* 41 */            return ooiIlOl1iI;
                }
            }
