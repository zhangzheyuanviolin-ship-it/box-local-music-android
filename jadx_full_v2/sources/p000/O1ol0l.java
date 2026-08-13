            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class O1ol0l extends Oll0io implements IlliIl1l11O {
                public final boolean I00iOIl;
                public final O1ol100o0O I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final IllOOo00lI I00iio;
                public final Context I00ilI0I1;
                public final OloIl1l1oOii I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1ol0l(boolean z, O1ol100o0O o1ol100o0O, O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI, Context context, OloIl1l1oOii oloIl1l1oOii, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = z;
/* 3 */             this.I00iiI = o1ol100o0O;
/* 5 */             this.I00iiO = o1oIOiI11o0;
/* 7 */             this.I00iio = illOOo00lI;
/* 9 */             this.I00ilI0I1 = context;
/* 11 */            this.I00ilO0 = oloIl1l1oOii;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new O1ol0l(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             O1ol0l o1ol0l = (O1ol0l) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            o1ol0l.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 6 */             boolean z = this.I00iOIl;
/* 8 */             IllOOo00lI illOOo00lI = this.I00iio;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            O1ol100o0O o1ol100o0O = this.I00iiI;
/* 14 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 16 */            if (!z) {
/* 36 */                O1oOil o1oOil = (O1oOil) ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 46 */                if ((o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiO) {
/* 48 */                    illOOo00lI.invoke();
/* 51 */                    return ooiIlOl1iI;
                        }
                    }
/* 54 */            if (o1oIOiI11o0.I00Io1lO) {
/* 57 */                o1oIOiI11o0.I00Io1o110i = false;
/* 59 */                return ooiIlOl1iI;
                    }
/* 68 */            O1ol100o0O.I000O01llI0(o1ol100o0O, this.I00ilI0I1, this.I00ilO0, o1oIOiI11o0, null, null, 24);
/* 71 */            String str = o1oIOiI11o0.I00000oIO;
/* 74 */            o1oIOiI11o0.I00Io1lO = true;
/* 80 */            o1ol100o0O.I00IoO0(o1oIOiI11o0, O1oOl0.I00iiI, "");
/* 87 */            I0IO1io0I i0IO1io0I = new I0IO1io0I(11);
/* 90 */            i0IO1io0I.I00iiO = o1oIOiI11o0;
/* 92 */            i0IO1io0I.I00iio = o1ol100o0O;
/* 94 */            Context context = this.I00ilI0I1;
/* 96 */            i0IO1io0I.I00ilI0I1 = context;
/* 98 */            OloIl1l1oOii oloIl1l1oOii = this.I00ilO0;
/* 100 */           i0IO1io0I.I00ilO0 = oloIl1l1oOii;
/* 102 */           i0IO1io0I.I00iiI = illOOo00lI;
/* 104 */           VarHandle.storeStoreFence();
/* 109 */           Ii0ioo10iO0 ii0ioo10iO0I00111O = o1ol100o0O.I00111O(oloIl1l1oOii.I00000oIO);
/* 113 */           if (ii0ioo10iO0I00111O != null) {
/* 119 */               ii0ioo10iO0I00111O.I0000Il00O(context, OooiooIOO.I00000oIO(o1ol100o0O), o1oIOiI11o0, i0IO1io0I);
                    }
/* 168 */           return ooiIlOl1iI;
                }
            }
