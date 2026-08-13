            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I10li1 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final I10llI0II11l I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10li1(I10llI0II11l i10llI0II11l, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i10llI0II11l;
                }

                @Override
                public final Object invoke(Object obj) {
                    long j;
/* 1 */             int i = this.I00iOIl;
/* 7 */             I10llI0II11l i10llI0II11l = this.I00iiI;
                    switch (i) {
                        case 0:
/* 314 */                   long jIntValue = ((Number) obj).intValue();
/* 340 */                   return Integer.valueOf(((int) (i10llI0II11l.I000II() >> 32)) - ((int) (i10llI0II11l.I0001Ioi1lo((jIntValue & 4294967295L) | (jIntValue << 32), i10llI0II11l.I000II()) >> 32)));
                        case 1:
/* 286 */                   int iIntValue = ((Number) obj).intValue();
                            long j2 = iIntValue;
/* 307 */                   return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((j2 & 4294967295L) | (j2 << 32), i10llI0II11l.I000II()) >> 32))) - iIntValue);
                        case 2:
/* 253 */                   long jIntValue2 = ((Number) obj).intValue();
/* 279 */                   return Integer.valueOf(((int) (i10llI0II11l.I000II() & 4294967295L)) - ((int) (i10llI0II11l.I0001Ioi1lo((jIntValue2 & 4294967295L) | (jIntValue2 << 32), i10llI0II11l.I000II()) & 4294967295L)));
                        case 3:
/* 225 */                   int iIntValue2 = ((Number) obj).intValue();
                            long j3 = iIntValue2;
/* 246 */                   return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((j3 & 4294967295L) | (j3 << 32), i10llI0II11l.I000II()) & 4294967295L))) - iIntValue2);
                        case 4:
/* 175 */                   int iIntValue3 = ((Number) obj).intValue();
/* 193 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) i10llI0II11l.I0000oI00.I000II(i10llI0II11l.I00000oIO.I0000O.getValue());
                            long j4 = iIntValue3;
/* 218 */                   return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((4294967295L & j4) | (j4 << 32), olO01l1oOil != null ? ((IooOl0ol01) olO01l1oOil.getValue()).I00000oIO : 0L) >> 32))) - iIntValue3);
                        case 5:
/* 122 */                   int iIntValue4 = ((Number) obj).intValue();
/* 140 */                   OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) i10llI0II11l.I0000oI00.I000II(i10llI0II11l.I00000oIO.I0000O.getValue());
/* 150 */                   j = olO01l1oOil2 != null ? ((IooOl0ol01) olO01l1oOil2.getValue()).I00000oIO : 0L;
                            long j5 = iIntValue4;
/* 168 */                   return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((4294967295L & j5) | (j5 << 32), j) >> 32))) + ((int) (j >> 32)));
                        case 6:
/* 72 */                    int iIntValue5 = ((Number) obj).intValue();
/* 90 */                    OlO01l1oOil olO01l1oOil3 = (OlO01l1oOil) i10llI0II11l.I0000oI00.I000II(i10llI0II11l.I00000oIO.I0000O.getValue());
                            long j6 = iIntValue5;
/* 115 */                   return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((j6 & 4294967295L) | (j6 << 32), olO01l1oOil3 != null ? ((IooOl0ol01) olO01l1oOil3.getValue()).I00000oIO : 0L) & 4294967295L))) - iIntValue5);
                        default:
/* 19 */                    int iIntValue6 = ((Number) obj).intValue();
/* 37 */                    OlO01l1oOil olO01l1oOil4 = (OlO01l1oOil) i10llI0II11l.I0000oI00.I000II(i10llI0II11l.I00000oIO.I0000O.getValue());
/* 47 */                    j = olO01l1oOil4 != null ? ((IooOl0ol01) olO01l1oOil4.getValue()).I00000oIO : 0L;
                            long j7 = iIntValue6;
/* 65 */                    return Integer.valueOf((-((int) (i10llI0II11l.I0001Ioi1lo((j7 & 4294967295L) | (j7 << 32), j) & 4294967295L))) + ((int) (j & 4294967295L)));
                    }
                }
            }
