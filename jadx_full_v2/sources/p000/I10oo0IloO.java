            package p000;

            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I10oo0IloO extends O0iO10011II implements Function3 {
                public final Function1 I00iOIl;
                public final OoI1iOl0IoI I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10oo0IloO(Function1 function1, OoI1iOl0IoI ooI1iOl0IoI) {
/* 6 */             super(3);
/* 1 */             this.I00iOIl = function1;
/* 3 */             this.I00iiI = ooI1iOl0IoI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
/* 1 */             O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) obj;
/* 9 */             OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) obj2).I001lllioOl(((IOo0oO11ll1O) obj3).I00000oIO);
/* 24 */            if (o1iOIoOiO0.I00OloOo()) {
/* 46 */                if (((Boolean) this.I00iOIl.invoke(this.I00iiI.I0000O.getValue())).booleanValue()) {
/* 59 */                    j = (oO1I0001000iI001lllioOl.I00iOIl << 32) | (oO1I0001000iI001lllioOl.I00iiI & 4294967295L);
                        } else {
/* 48 */                    j = 0;
                        }
                    }
/* 73 */            return o1iOIoOiO0.I001i1lo1io((int) (j >> 32), (int) (4294967295L & j), Il011I1OiO0I.I00iOIl, new I10ol0(oO1I0001000iI001lllioOl, 0));
                }
            }
