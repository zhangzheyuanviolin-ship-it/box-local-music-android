            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.io.IOException;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            
            public abstract class OiIlo1o1i {
                public static final OoIlIoo1oiOo I00000oIO = new OoIlIoo1oiOo();
                public static final Type I00000oOI = new OiIlo0().I00000oOI;

                public static void I00000oIO(Context context, ArrayList arrayList) {
/* 8 */             SharedPreferences.Editor editorEdit = context.getSharedPreferences("box_settings", 0).edit();
/* 12 */            OoIlIoo1oiOo ooIlIoo1oiOo = I00000oIO;
/* 14 */            ooIlIoo1oiOo.getClass();
/* 17 */            Class<?> cls = arrayList.getClass();
/* 23 */            StringBuilder sb = new StringBuilder();
                    try {
/* 33 */                O01ooi1IIiiO o01ooi1IIiiO = new O01ooi1IIiiO(new OlOl0Oi(0, sb));
/* 40 */                o01ooi1IIiiO.I00IioO0OiOi((IlioO1) ooIlIoo1oiOo.I00ioIO);
/* 45 */                o01ooi1IIiiO.I00l0I0l0lO1 = ooIlIoo1oiOo.I00iiI;
/* 48 */                o01ooi1IIiiO.I00Io1lO(2);
/* 51 */                o01ooi1IIiiO.I00li1OI = false;
/* 53 */                ooIlIoo1oiOo.I000o00OoI0I(arrayList, cls, o01ooi1IIiiO);
/* 66 */                editorEdit.putString("saved_system_prompts", sb.toString()).apply();
                    } catch (IOException e) {
/* 106 */               throw new O01Oo001(e);
                    }
                }
            }
