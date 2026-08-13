            package p000;

            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import java.util.TimeZone;
            
            public final class O01IOO implements OoloOoIl {
                public static final SimpleDateFormat I00000oIO;

                static {
/* 7 */             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
/* 10 */            I00000oIO = simpleDateFormat;
/* 18 */            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 11 */            ((OoloiiOiiil) obj2).add(I00000oIO.format((Date) obj));
                }
            }
