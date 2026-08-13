            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOl1oii10I {
                public static final void I00000oIO(OloilI0Ol oloilI0Ol, Ii0110 ii0110, Context context, OlollIOIlo olollIOIlo, boolean z, Function1 function1) {
/* 4 */             OlolIi000l ololIi000l = new OlolIi000l(1);
/* 7 */             ololIi000l.I00iiI = ii0110;
/* 9 */             ololIi000l.I00iiO = function1;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            Resources resources = context.getResources();
/* 20 */            OiilllO oiilllO = new OiilllO(1);
/* 23 */            oiilllO.I00iiI = ololIi000l;
/* 26 */            oiilllO.I00iiO = null;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            if (z) {
/* 33 */                Object obj = olollIOIlo.I00iOIl;
/* 37 */                String string = resources.getString(olollIOIlo.I00iiI);
/* 41 */                int i = olollIOIlo.I00iiO;
/* 45 */                OlolOO0oi ololOO0oi = new OlolOO0oi(obj);
/* 48 */                ololOO0oi.I00000oOI = string;
/* 50 */                ololOO0oi.I0000Il00O = i;
/* 52 */                ololOO0oi.I0000O = oiilllO;
/* 54 */                VarHandle.storeStoreFence();
/* 59 */                oloilI0Ol.I00000oIO.I00000oOI(ololOO0oi);
                    }
                }
            }
