            package p000;
            
            public final class O000101lOi extends Oi10IIi {
                public int I00iOIl;
                public final IlliIl1l11O I00iiI;
                public final IOoil1iiIilo I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O000101lOi(IOoil1iiIilo iOoil1iiIilo, IOoil1iiIilo iOoil1iiIilo2, IlliIl1l11O illiIl1l11O) {
/* 5 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = illiIl1l11O;
/* 3 */             this.I00iiO = iOoil1iiIilo2;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 5 */             if (i == 0) {
/* 22 */                this.I00iOIl = 1;
/* 24 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                IlliIl1l11O illiIl1l11O = this.I00iiI;
/* 29 */                OoOOI1100oI0.I0000Il00O(2, illiIl1l11O);
/* 34 */                return illiIl1l11O.invoke(this.I00iiO, this);
                    }
/* 7 */             if (i != 1) {
/* 17 */                I000II.I001IO000("This coroutine had already completed");
/* 20 */                return null;
                    }
/* 9 */             this.I00iOIl = 2;
/* 11 */            lIoii1l01l0i.I00000oOI(obj);
/* 14 */            return obj;
                }
            }
