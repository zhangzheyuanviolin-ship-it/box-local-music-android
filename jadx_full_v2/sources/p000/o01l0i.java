            package p000;

            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public abstract class o01l0i {
                public static final ll1I00l I00000oIO;

                static {
                    ll1I00l o01i0i;
                    try {
/* 3 */                 o01i0i = new o01iO1ooOil();
                    } catch (ReflectiveOperationException unused) {
/* 9 */                 o01i0i = new o01i0I();
                    }
/* 12 */            I00000oIO = o01i0i;
                }

                public static void I00000oIO(AccessibleObject accessibleObject) throws SecurityException {
                    try {
/* 2 */                 accessibleObject.setAccessible(true);
                    } catch (Exception e) {
/* 8 */                 String strI00000oOI = I00000oOI(accessibleObject, false);
/* 12 */                int length = strI00000oOI.length();
/* 18 */                String strI0000oI00 = I0000oI00(e);
/* 49 */                throw new llIIooI0iolO(IIl001iO0Io.I00100o1O0lo(new StringBuilder(length + 111 + strI0000oI00.length()), "Failed making ", strI00000oOI, " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", strI0000oI00), e, 25);
                    }
                }

                public static String I00000oOI(AccessibleObject accessibleObject, boolean z) {
                    String strConcat;
/* 6 */             if (accessibleObject instanceof Field) {
/* 10 */                String strI0000Il00O = I0000Il00O((Field) accessibleObject);
/* 27 */                strConcat = IIlIOloOOO.I0010I0i(new StringBuilder(strI0000Il00O.length() + 8), "field '", strI0000Il00O, "'");
                    } else if (accessibleObject instanceof Method) {
/* 36 */                Method method = (Method) accessibleObject;
/* 44 */                StringBuilder sb = new StringBuilder(method.getName());
/* 47 */                I0001Ioi1lo(method, sb);
/* 50 */                String string = sb.toString();
/* 58 */                String name = method.getDeclaringClass().getName();
/* 76 */                StringBuilder sb2 = new StringBuilder(string.length() + name.length() + 9 + 1);
/* 81 */                sb2.append("method '");
/* 84 */                sb2.append(name);
/* 89 */                sb2.append("#");
/* 92 */                sb2.append(string);
/* 95 */                sb2.append("'");
/* 98 */                strConcat = sb2.toString();
                    } else if (accessibleObject instanceof Constructor) {
/* 109 */               String strI0000O = I0000O((Constructor) accessibleObject);
/* 126 */               strConcat = IIlIOloOOO.I0010I0i(new StringBuilder(strI0000O.length() + 14), "constructor '", strI0000O, "'");
                    } else {
/* 141 */               strConcat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
                    }
/* 145 */           if (!z || !Character.isLowerCase(strConcat.charAt(0))) {
/* 551 */               return strConcat;
                    }
/* 162 */           char upperCase = Character.toUpperCase(strConcat.charAt(0));
/* 166 */           String strSubstring = strConcat.substring(1);
/* 185 */           StringBuilder sb3 = new StringBuilder(String.valueOf(upperCase).length() + strSubstring.length());
/* 188 */           sb3.append(upperCase);
/* 191 */           sb3.append(strSubstring);
/* 194 */           return sb3.toString();
                }

                public static String I0000Il00O(Field field) {
/* 5 */             String name = field.getDeclaringClass().getName();
/* 9 */             String name2 = field.getName();
/* 35 */            return IIlIOloOOO.I0010I0i(new StringBuilder(name.length() + 1 + String.valueOf(name2).length()), name, "#", name2);
                }

                public static String I0000O(Constructor constructor) {
/* 11 */            StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
/* 14 */            I0001Ioi1lo(constructor, sb);
/* 17 */            return sb.toString();
                }

                public static String I0000oI00(Exception exc) {
/* 15 */            if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
/* 49 */                return "";
                    }
/* 17 */            String message = exc.getMessage();
/* 44 */            return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
                }

                public static void I0001Ioi1lo(AccessibleObject accessibleObject, StringBuilder sb) {
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
            }
