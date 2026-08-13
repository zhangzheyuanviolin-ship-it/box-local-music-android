            package p000;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class l0oioo1oO {
                public static final iili011O1 I00000oIO;

                static {
/* 4 */             iili011O1 iili011o1 = new iili011O1(2);
/* 12 */            iili011o1.I00iiI = new HashMap();
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I00000oIO = iili011o1;
                }

                public static void I00000oIO() {
/* 5 */             HashMap map = (HashMap) I00000oIO.I00iiI;
/* 15 */            if (map.containsKey(io1IillOoO.class) && !((String) map.get(io1IillOoO.class)).equals("drishti.InferenceCalculatorOptions.Delegate")) {
/* 52 */                throw new zzhu(6, "Protobuf type name: drishti.InferenceCalculatorOptions.Delegate conflicts with: ".concat(String.valueOf((String) map.get(io1IillOoO.class))));
                    }
/* 53 */            map.put(io1IillOoO.class, "drishti.InferenceCalculatorOptions.Delegate");
                }
            }
