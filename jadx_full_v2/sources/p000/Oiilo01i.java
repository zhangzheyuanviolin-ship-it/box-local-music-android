            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Oiilo01i implements Function1 {
                public final int I00iOIl;
                public IiIooOOOI I00iiI;
                public OI10i0Il I00iiO;

                public Oiilo01i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 131 */                   IiIooOOOI iiIooOOOI = this.I00iiI;
/* 133 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 141 */                   I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(13);
/* 144 */                   i11i0ol0l0.I00iiI = (IllOOo00lI) obj;
/* 146 */                   VarHandle.storeStoreFence();
/* 152 */                   Oiilo01i oiilo01i = new Oiilo01i(1);
/* 155 */                   oiilo01i.I00iiI = iiIooOOOI;
/* 157 */                   oiilo01i.I00iiO = oI10i0Il;
/* 159 */                   VarHandle.storeStoreFence();
/* 162 */                   return O1O1oI1OI.I00000oIO(i11i0ol0l0, oiilo01i);
                        case 1:
/* 91 */                    IiIooOOOI iiIooOOOI2 = this.I00iiI;
/* 127 */                   this.I00iiO.setValue(IooOl0ol01.I00000oIO((4294967295L & iiIooOOOI2.I00l0OO0IO(Iil1iI01I0O0.I00000oIO(r9.I00000oIO))) | (iiIooOOOI2.I00l0OO0IO(Iil1iI01I0O0.I00000oOI(((Iil1iI01I0O0) obj).I00000oIO)) << 32)));
/* 130 */                   return ooiIlOl1iI;
                        case 2:
/* 55 */                    IiIooOOOI iiIooOOOI3 = this.I00iiI;
/* 57 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 65 */                    I11i0ol0l0 i11i0ol0l02 = new I11i0ol0l0(15);
/* 68 */                    i11i0ol0l02.I00iiI = (IllOOo00lI) obj;
/* 70 */                    VarHandle.storeStoreFence();
/* 76 */                    Oiilo01i oiilo01i2 = new Oiilo01i(3);
/* 79 */                    oiilo01i2.I00iiI = iiIooOOOI3;
/* 81 */                    oiilo01i2.I00iiO = oI10i0Il2;
/* 83 */                    VarHandle.storeStoreFence();
/* 86 */                    return O1O1oI1OI.I00000oIO(i11i0ol0l02, oiilo01i2);
                        default:
/* 15 */                    IiIooOOOI iiIooOOOI4 = this.I00iiI;
/* 51 */                    this.I00iiO.setValue(IooOl0ol01.I00000oIO((4294967295L & iiIooOOOI4.I00l0OO0IO(Iil1iI01I0O0.I00000oIO(r9.I00000oIO))) | (iiIooOOOI4.I00l0OO0IO(Iil1iI01I0O0.I00000oOI(((Iil1iI01I0O0) obj).I00000oIO)) << 32)));
/* 54 */                    return ooiIlOl1iI;
                    }
                }
            }
