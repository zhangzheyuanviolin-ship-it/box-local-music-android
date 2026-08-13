            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public abstract class IillIi1 {
                public static final IillI1lo11l0 I00000oIO = new IillI1lo11l0(3, null, 0);
                public static final IillI1lo11l0 I00000oOI = new IillI1lo11l0(3, null, 1);

                public static O1ooiI111i I00000oIO(Ol111o0 ol111o0, OIilII oIilII, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, boolean z2, Function3 function3, boolean z3, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 z = true;
                    }
/* 8 */             if ((i & 8) != 0) {
/* 10 */                oI0lOIiOIOOo = null;
                    }
/* 14 */            if ((i & 16) != 0) {
/* 16 */                z2 = false;
                    }
/* 19 */            if ((i & Barcode.FORMAT_ITF) != 0) {
/* 21 */                z3 = false;
                    }
/* 24 */            Iill1IlI1oO0 iill1IlI1oO0 = new Iill1IlI1oO0();
/* 27 */            iill1IlI1oO0.I00000oIO = ol111o0;
/* 29 */            iill1IlI1oO0.I00000oOI = oIilII;
/* 31 */            iill1IlI1oO0.I0000Il00O = z;
/* 33 */            iill1IlI1oO0.I0000O = oI0lOIiOIOOo;
/* 35 */            iill1IlI1oO0.I0000oI00 = z2;
/* 39 */            iill1IlI1oO0.I0001Ioi1lo = I00000oIO;
/* 41 */            iill1IlI1oO0.I000II = function3;
/* 43 */            iill1IlI1oO0.I000O01llI0 = z3;
/* 45 */            VarHandle.storeStoreFence();
/* 1750 */          return iill1IlI1oO0;
                }

                public static final long I00000oOI(long j) {
/* 33 */            return li1OoIii00.I00000oIO(Float.isNaN(OooIOilolOo.I0000Il00O(j)) ? 0.0f : OooIOilolOo.I0000Il00O(j), Float.isNaN(OooIOilolOo.I0000O(j)) ? 0.0f : OooIOilolOo.I0000O(j));
                }
            }
