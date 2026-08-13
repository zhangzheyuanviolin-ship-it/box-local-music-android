            package p000;

            import android.content.Context;
            import androidx.work.WorkerParameters;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 18 */    public final class I10i01i0Iilo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10i01i0Iilo(Object obj, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = obj;
/* 5 */             this.I00iiI = serializable;
/* 7 */             this.I00ilI0I1 = obj2;
/* 9 */             this.I00ilO0 = obj3;
/* 11 */            this.I00io1l = obj4;
/* 13 */            this.I00ioIO = obj5;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ioIO;
/* 5 */             Object obj3 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 216 */                   I10i01i0Iilo i10i01i0Iilo = new I10i01i0Iilo((IO1010) this.I00ilI0I1, (I10i01) this.I00ilO0, (OI10i0Il) obj3, (OI10i0Il) obj2, iOoil1iiIilo, 0);
/* 219 */                   i10i01i0Iilo.I00iiI = obj;
/* 221 */                   return i10i01i0Iilo;
                        case 1:
/* 188 */                   I10i01i0Iilo i10i01i0Iilo2 = new I10i01i0Iilo((List) obj3, (ArrayList) obj2, iOoil1iiIilo);
/* 191 */                   i10i01i0Iilo2.I00ilO0 = obj;
/* 193 */                   return i10i01i0Iilo2;
                        case 2:
/* 177 */                   return new I10i01i0Iilo((O1111l) this.I00iio, (String) this.I00iiI, (Ol1OIlllo) this.I00ilI0I1, (String) this.I00ilO0, (IO1Io1IOOOIi) obj3, (I000l1) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 134 */                   OI1110o0II oI1110o0II = OI1110o0II.I00iOIl;
/* 140 */                   I10i01i0Iilo i10i01i0Iilo3 = new I10i01i0Iilo((OI11i1OO) obj3, (Function1) obj2, iOoil1iiIilo);
/* 143 */                   i10i01i0Iilo3.I00ilO0 = obj;
/* 145 */                   return i10i01i0Iilo3;
                        case 4:
/* 127 */                   return new I10i01i0Iilo((O10oIiIi0OI0) this.I00iio, (Throwable) this.I00iiI, (IOllii) this.I00ilI0I1, (OloIli) this.I00ilO0, (String) obj3, (WorkerParameters) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 90 */                    I10i01i0Iilo i10i01i0Iilo4 = new I10i01i0Iilo((OO1io0l0) this.I00iio, (Function1) this.I00ilI0I1, (Function1) this.I00ilO0, (Function3) obj3, (Function1) obj2, iOoil1iiIilo, 5);
/* 93 */                    i10i01i0Iilo4.I00iiI = obj;
/* 95 */                    return i10i01i0Iilo4;
                        case 6:
/* 59 */                    I10i01i0Iilo i10i01i0Iilo5 = new I10i01i0Iilo((Oilo101I11l0) this.I00iio, (OolOOl0) this.I00ilI0I1, (List) this.I00ilO0, (Map) obj3, (IIll0oO) obj2, iOoil1iiIilo, 6);
/* 62 */                    i10i01i0Iilo5.I00iiI = obj;
/* 64 */                    return i10i01i0Iilo5;
                        default:
/* 30 */                    return new I10i01i0Iilo((o0l0iIlo0O) this.I00ilI0I1, (IOiOol0) this.I00ilO0, (Context) obj3, (Function1) obj2, iOoil1iiIilo, 7);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                    }
/* 18 */            return ((I10i01i0Iilo) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
                    	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
                    	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
                    */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x051b -> B:226:0x04f8). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x054b -> B:226:0x04f8). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x058b -> B:247:0x058f). Please report as a decompilation issue!!! */
                @Override
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
                        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
                        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
                        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
                        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
                        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
                        */
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        Method dump skipped, instructions count: 1496
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.I10i01i0Iilo.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public I10i01i0Iilo(OI11i1OO oI11i1OO, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
                    OI1110o0II oI1110o0II = OI1110o0II.I00iOIl;
/* 20 */            this.I00io1l = oI11i1OO;
                    this.I00ioIO = function1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public I10i01i0Iilo(Object obj, Object obj2, Object obj3, Object obj4, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                    this.I00ilO0 = obj2;
                    this.I00io1l = obj3;
                    this.I00ioIO = obj4;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public I10i01i0Iilo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 22 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                    this.I00ilO0 = obj3;
                    this.I00io1l = obj4;
                    this.I00ioIO = obj5;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public I10i01i0Iilo(List list, ArrayList arrayList, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 23 */            this.I00io1l = list;
                    this.I00ioIO = arrayList;
                }
            }
