            package p000;

            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public abstract class OOoi0l1 {
                public static final lIo000I I00000oIO;

                static {
                    lIo000I oOoOlo;
                    try {
/* 3 */                 oOoOlo = new OOoOooi1Ioi();
                    } catch (ReflectiveOperationException unused) {
/* 9 */                 oOoOlo = new OOoOlo();
                    }
/* 12 */            I00000oIO = oOoOlo;
                }

                public static void I00000oIO(AccessibleObject accessibleObject, StringBuilder sb) {
/* 3 */             sb.append('(');
/* 19 */            Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
/* 25 */            for (int i = 0; i < parameterTypes.length; i++) {
/* 27 */                if (i > 0) {
/* 31 */                    sb.append(", ");
                        }
/* 40 */                sb.append(parameterTypes[i].getSimpleName());
                    }
/* 48 */            sb.append(')');
                }

                public static String I00000oOI(Constructor constructor) {
/* 11 */            StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
/* 14 */            I00000oIO(constructor, sb);
/* 17 */            return sb.toString();
                }

                public static String I0000Il00O(Field field) {
/* 26 */            return field.getDeclaringClass().getName() + "#" + field.getName();
                }

                public static String I0000O(AccessibleObject accessibleObject, boolean z) {
                    String str;
/* 5 */             if (accessibleObject instanceof Field) {
/* 26 */                str = "field '" + I0000Il00O((Field) accessibleObject) + "'";
                    } else if (accessibleObject instanceof Method) {
/* 35 */                Method method = (Method) accessibleObject;
/* 43 */                StringBuilder sb = new StringBuilder(method.getName());
/* 46 */                I00000oIO(method, sb);
/* 82 */                str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
                    } else if (accessibleObject instanceof Constructor) {
/* 110 */               str = "constructor '" + I00000oOI((Constructor) accessibleObject) + "'";
                    } else {
/* 129 */               str = "<unknown AccessibleObject> " + accessibleObject.toString();
                    }
/* 133 */           if (!z || !Character.isLowerCase(str.charAt(0))) {
/* 551 */               return str;
                    }
/* 170 */           return Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }

                public static String I0000oI00(Exception exc) {
/* 15 */            if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
/* 49 */                return "";
                    }
/* 17 */            String message = exc.getMessage();
/* 44 */            return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
                }

                public static void I0001Ioi1lo(AccessibleObject accessibleObject) throws SecurityException {
                    try {
/* 2 */                 accessibleObject.setAccessible(true);
                    } catch (Exception e) {
/* 18 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Failed making ", I0000O(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
/* 26 */                sbI001IIilI0O.append(I0000oI00(e));
/* 49 */                throw new O01Oo001(sbI001IIilI0O.toString(), e);
                    }
                }
            }
