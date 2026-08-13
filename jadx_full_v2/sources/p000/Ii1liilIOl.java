            package p000;

            import java.lang.invoke.VarHandle;
            import java.text.DateFormat;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Locale;
            
            public class Ii1liilIOl implements OoO00iO0OOl0 {
                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 5 */             if (ooOilO.I00000oIO != Date.class) {
/* 89 */                return null;
                    }
/* 9 */             Ii1llOil ii1llOil = new Ii1llOil();
/* 14 */            ArrayList arrayList = new ArrayList();
/* 17 */            ii1llOil.I00000oOI = arrayList;
/* 21 */            ii1llOil.I00000oIO = Ii1ll01O1i.I00000oIO;
/* 23 */            Locale locale = Locale.US;
/* 30 */            arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
/* 41 */            if (!Locale.getDefault().equals(locale)) {
/* 47 */                arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                    }
/* 54 */            if (O0100IlI.I00000oIO >= 9) {
/* 82 */                arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
                    }
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            return ii1llOil;
                }

                public final String toString() {
/* 1 */             return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
                }
            }
