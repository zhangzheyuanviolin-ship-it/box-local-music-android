            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O1oi00ll implements Function3 {
                public OI10i0Il I00iOIl;
                public O1oIOiI11o0 I00iiI;
                public OloIl1l1oOii I00iiO;
                public O1ol100o0O I00iio;
                public Function1 I00ilI0I1;
                public Function1 I00ilO0;
                public boolean I00io1l;
                public OlO01l1oOil I00ioIO;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             OI10i0Il oI10i0Il = this.I00iOIl;
/* 5 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 7 */             OloIl1l1oOii oloIl1l1oOii = this.I00iiO;
/* 9 */             O1ol100o0O o1ol100o0O = this.I00iio;
/* 11 */            Function1 function1 = this.I00ilI0I1;
/* 13 */            Function1 function12 = this.I00ilO0;
/* 15 */            boolean z = this.I00io1l;
/* 17 */            OlO01l1oOil olO01l1oOil = this.I00ioIO;
/* 21 */            Oiool011li oiool011li = (Oiool011li) obj;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 37 */            if ((iIntValue & 6) == 0) {
/* 48 */                iIntValue |= iloI0lOlll1.I000II(oiool011li) ? 4 : 2;
                    }
/* 64 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 70 */                Boolean bool = (Boolean) oI10i0Il.getValue();
/* 72 */                bool.booleanValue();
/* 77 */                O1oi0i10O1OI o1oi0i10O1OI = new O1oi0i10O1OI();
/* 80 */                o1oi0i10O1OI.I00iOIl = oiool011li;
/* 82 */                o1oi0i10O1OI.I00iiI = o1oIOiI11o0;
/* 84 */                o1oi0i10O1OI.I00iiO = oloIl1l1oOii;
/* 86 */                o1oi0i10O1OI.I00iio = o1ol100o0O;
/* 88 */                o1oi0i10O1OI.I00ilI0I1 = function1;
/* 90 */                o1oi0i10O1OI.I00ilO0 = function12;
/* 92 */                o1oi0i10O1OI.I00io1l = z;
/* 94 */                o1oi0i10O1OI.I00ioIO = olO01l1oOil;
/* 96 */                VarHandle.storeStoreFence();
/* 120 */               O1OIIoio0i1.I00000oOI(bool, null, null, null, "item_layout_transition", null, iiioOl1O.I00000oOI(-2034304047, o1oi0i10O1OI, iloI0lOlll1), iloI0lOlll1, 1597440, 46);
                    } else {
/* 126 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 129 */           return OoiIlOl1iI.I00000oIO;
                }
            }
