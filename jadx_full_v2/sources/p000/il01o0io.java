            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il01o0io {
                public static Object I00000oIO(Collection collection, Ii100OlIo10 ii100OlIo10, il01lilooO il01lilooo) {
/* 5 */             HashSet hashSet = new HashSet();
/* 8 */             Io0IIl00 io0IIl00 = new Io0IIl00();
/* 11 */            io0IIl00.I00000oIO = hashSet;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            Iterator it = collection.iterator();
/* 24 */            while (it.hasNext()) {
/* 30 */                I00000oOI(it.next(), ii100OlIo10, io0IIl00, il01lilooo);
                    }
/* 34 */            return il01lilooo.I0000Il00O();
                }

                public static void I00000oOI(Object obj, Ii100OlIo10 ii100OlIo10, Io0IIl00 io0IIl00, il01lilooO il01lilooo) {
/* 1 */             if (obj != null) {
/* 9 */                 if (io0IIl00.I00000oIO.add(obj) && il01lilooo.I00000oOI(obj)) {
/* 23 */                    Iterator it = ii100OlIo10.I0001Ioi1lo(obj).iterator();
/* 31 */                    while (it.hasNext()) {
/* 37 */                        I00000oOI(it.next(), ii100OlIo10, io0IIl00, il01lilooo);
                            }
/* 41 */                    il01lilooo.I00000oIO(obj);
/* 44 */                    return;
                        }
/* 18 */                return;
                    }
/* 46 */            Object[] objArr = new Object[3];
                    switch (22) {
                        case 1:
                        case 5:
                        case 8:
                        case 11:
                        case 15:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
/* 86 */                    objArr[0] = "neighbors";
                            break;
                        case 2:
                        case 12:
                        case 16:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_HIP:
/* 81 */                    objArr[0] = "visited";
                            break;
                        case 3:
                        case 6:
                        case 13:
                        case PoseLandmark.LEFT_KNEE:
/* 76 */                    objArr[0] = "handler";
                            break;
                        case 4:
                        case 7:
                        case 17:
                        case PoseLandmark.RIGHT_INDEX:
                        default:
/* 56 */                    objArr[0] = "nodes";
                            break;
                        case 9:
/* 71 */                    objArr[0] = "predicate";
                            break;
                        case 10:
                        case 14:
/* 66 */                    objArr[0] = "node";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 61 */                    objArr[0] = "current";
                            break;
                    }
/* 91 */            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
                    switch (22) {
                        case 7:
                        case 8:
                        case 9:
/* 119 */                   objArr[2] = "ifAny";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
/* 114 */                   objArr[2] = "dfsFromNode";
                            break;
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
/* 109 */                   objArr[2] = "topologicalOrder";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
/* 104 */                   objArr[2] = "doDfs";
                            break;
                        default:
/* 99 */                    objArr[2] = "dfs";
                            break;
                    }
/* 132 */           throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
                public static Boolean I0000Il00O(Collection collection, Ii100OlIo10 ii100OlIo10, Function1 function1) {
/* 7 */             Ii100Ol ii100Ol = new Ii100Ol(0);
/* 10 */            ii100Ol.I00000oOI = function1;
/* 12 */            ii100Ol.I0000Il00O = new boolean[1];
/* 14 */            VarHandle.storeStoreFence();
/* 21 */            return (Boolean) I00000oIO(collection, ii100OlIo10, ii100Ol);
                }
            }
