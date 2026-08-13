            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class I10Ol0iIoi extends Oll0io implements Function1 {
                public I110IiI1I1 I00iOIl;
                public OOo0l0ii10l I00iiI;
                public int I00iiO;
                public final I10i01 I00iio;
                public final Object I00ilI0I1;
                public final OloIIOlO I00ilO0;
                public final long I00io1l;
                public final Function1 I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10Ol0iIoi(I10i01 i10i01, Object obj, OloIIOlO oloIIOlO, long j, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00iio = i10i01;
/* 3 */             this.I00ilI0I1 = obj;
/* 5 */             this.I00ilO0 = oloIIOlO;
/* 7 */             this.I00io1l = j;
/* 9 */             this.I00ioIO = function1;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new I10Ol0iIoi(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((I10Ol0iIoi) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    I110IiI1I1 i110IiI1I1;
                    OOo0l0ii10l oOo0l0ii10l;
/* 3 */             OloIIOlO oloIIOlO = this.I00ilO0;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiO;
/* 10 */            I10i01 i10i01 = this.I00iio;
                    try {
/* 12 */                if (i == 0) {
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    i10i01.I0000Il00O.I00iiO = (I110ooool) i10i01.I00000oIO.I00000oIO.invoke(this.I00ilI0I1);
/* 58 */                    i10i01.I0000oI00.setValue(oloIIOlO.I0000Il00O);
/* 65 */                    i10i01.I0000O.setValue(Boolean.TRUE);
/* 68 */                    I110IiI1I1 i110IiI1I12 = i10i01.I0000Il00O;
/* 94 */                    I110IiI1I1 i110IiI1I13 = new I110IiI1I1(i110IiI1I12.I00iOIl, i110IiI1I12.I00iiI.getValue(), iOO0I0o1i0Il.I00000oIO(i110IiI1I12.I00iiO), i110IiI1I12.I00iio, Long.MIN_VALUE, i110IiI1I12.I00ilO0);
/* 100 */                   OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 103 */                   long j = this.I00io1l;
/* 105 */                   Function1 function1 = this.I00ioIO;
/* 111 */                   I0O1IO i0o1io = new I0O1IO(2);
/* 114 */                   i0o1io.I00iiI = i10i01;
/* 116 */                   i0o1io.I00iiO = i110IiI1I13;
/* 118 */                   i0o1io.I00iio = function1;
/* 120 */                   i0o1io.I00ilI0I1 = oOo0l0ii10l2;
/* 122 */                   VarHandle.storeStoreFence();
/* 125 */                   this.I00iOIl = i110IiI1I13;
/* 127 */                   this.I00iiI = oOo0l0ii10l2;
/* 129 */                   this.I00iiO = 1;
/* 136 */                   if (lOiIo0.I00000oOI(i110IiI1I13, oloIIOlO, j, i0o1io, this) == ii0111o) {
/* 138 */                       return ii0111o;
                            }
/* 139 */                   i110IiI1I1 = i110IiI1I13;
/* 140 */                   oOo0l0ii10l = oOo0l0ii10l2;
                        } else {
/* 14 */                    if (i != 1) {
/* 30 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 16 */                    oOo0l0ii10l = this.I00iiI;
/* 18 */                    i110IiI1I1 = this.I00iOIl;
/* 20 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 148 */               I10ooi0oO i10ooi0oO = oOo0l0ii10l.I00iOIl ? I10ooi0oO.I00iOIl : I10ooi0oO.I00iiI;
/* 150 */               i10i01.I0000Il00O();
/* 155 */               I1101lioO1 i1101lioO1 = new I1101lioO1();
/* 158 */               i1101lioO1.I00000oIO = i110IiI1I1;
/* 160 */               i1101lioO1.I00000oOI = i10ooi0oO;
/* 162 */               VarHandle.storeStoreFence();
/* 165 */               return i1101lioO1;
                    } catch (CancellationException e) {
/* 166 */               i10i01.I0000Il00O();
/* 437 */               throw e;
                    }
                }
            }
