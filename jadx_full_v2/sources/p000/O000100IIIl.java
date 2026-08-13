            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O000100IIIl extends Oi10IIi {
                public int I00iOIl;
                public final Function1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O000100IIIl(IOoil1iiIilo iOoil1iiIilo, Function1 function1) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = function1;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 4 */             if (i == 0) {
/* 22 */                this.I00iOIl = 1;
/* 24 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                Function1 function1 = this.I00iiI;
/* 29 */                OoOOI1100oI0.I0000Il00O(1, function1);
/* 32 */                return function1.invoke(this);
                    }
/* 6 */             if (i != 1) {
/* 17 */                I000II.I001IO000("This coroutine had already completed");
/* 20 */                return null;
                    }
/* 9 */             this.I00iOIl = 2;
/* 11 */            lIoii1l01l0i.I00000oOI(obj);
/* 14 */            return obj;
                }
            }
