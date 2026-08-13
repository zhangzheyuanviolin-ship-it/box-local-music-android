            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIOiIoll11Ol implements OoO00iO0OOl0 {
                public int I00iOIl;

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 5 */             if (ooOilO.I00000oIO != Object.class) {
/* 22 */                return null;
                    }
/* 9 */             int i = this.I00iOIl;
/* 11 */            OIOiOOI oIOiOOI = new OIOiOOI();
/* 14 */            oIOiOOI.I00000oIO = ooIlIoo1oiOo;
/* 16 */            oIOiOOI.I00000oOI = i;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            return oIOiOOI;
                }
            }
