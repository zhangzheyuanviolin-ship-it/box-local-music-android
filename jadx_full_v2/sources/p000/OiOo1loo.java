            package p000;
            
            public final class OiOo1loo extends Oll0io implements IlliIl1l11O {
                public Object I00iOIl;
                public final long I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiOo1loo(long j, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             OiOo1loo oiOo1loo = new OiOo1loo(this.I00iiI, iOoil1iiIilo);
/* 8 */             oiOo1loo.I00iOIl = obj;
/* 37 */            return oiOo1loo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             OiOo1loo oiOo1loo = (OiOo1loo) create((OiOol0il0il) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            oiOo1loo.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            Oii00o1ll oii00o1ll = ((OiOol0il0il) this.I00iOIl).I00000oIO;
/* 17 */            oii00o1ll.I0000O(oii00o1ll.I000iOII, this.I00iiI, 1);
/* 20 */            return OoiIlOl1iI.I00000oIO;
                }
            }
