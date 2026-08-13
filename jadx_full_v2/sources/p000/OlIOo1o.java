            package p000;

            import java.lang.invoke.VarHandle;
            import java.sql.Timestamp;
            import java.util.Date;
            
            public class OlIOo1o implements OoO00iO0OOl0 {
                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 5 */             if (ooOilO.I00000oIO != Timestamp.class) {
/* 32 */                return null;
                    }
/* 7 */             ooIlIoo1oiOo.getClass();
/* 17 */            OoO00O1IiOl ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(new OoOilO(Date.class));
/* 23 */            OlIOoIoO1 olIOoIoO1 = new OlIOoIoO1();
/* 26 */            olIOoIoO1.I00000oIO = ooO00O1IiOlI0000O;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            return olIOoIoO1;
                }
            }
