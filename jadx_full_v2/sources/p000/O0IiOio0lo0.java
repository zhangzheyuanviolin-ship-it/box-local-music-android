            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            public abstract class O0IiOio0lo0 implements IOIO10iOi1 {
                public static final OOoiliiIoloI I00iOIl = new OOoiliiIoloI("<v#(\\d+)>");

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
                public static void I00000oIO(ArrayList arrayList, ArrayList arrayList2, boolean z) {
                    Class cls;
/* 5 */             cls = DefaultConstructorMarker.class;
/* 7 */             boolean zI0000O = O0000Ioio00.I0000O(IOOi0Ool1i.I00IoIO0lI(arrayList2), cls);
                    ArrayList arrayListSubList = arrayList2;
/* 12 */            if (zI0000O) {
/* 20 */                arrayListSubList = arrayList2.subList(0, arrayList2.size() - 1);
                    }
/* 27 */            arrayList.addAll(arrayListSubList);
/* 36 */            int size = (arrayListSubList.size() + 31) / 32;
/* 38 */            for (int i = 0; i < size; i++) {
/* 42 */                arrayList.add(Integer.TYPE);
                    }
/* 53 */            arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
                }

                public static Method I00IOO(Class cls, String str, Class[] clsArr, Class cls2, boolean z) throws NoSuchMethodException, SecurityException {
                    Class clsI00000oIO;
                    Method methodI00IOO;
/* 2 */             if (z) {
/* 4 */                 clsArr[0] = cls;
                    }
/* 6 */             Method methodI00Io1o110i = I00Io1o110i(cls, str, clsArr, cls2);
/* 10 */            if (methodI00Io1o110i != null) {
/* 12 */                return methodI00Io1o110i;
                    }
/* 13 */            Class superclass = cls.getSuperclass();
/* 17 */            if (superclass != null && (methodI00IOO = I00IOO(superclass, str, clsArr, cls2, z)) != null) {
/* 25 */                return methodI00IOO;
                    }
/* 32 */            for (Class<?> cls3 : cls.getInterfaces()) {
/* 36 */                Method methodI00IOO2 = I00IOO(cls3, str, clsArr, cls2, z);
/* 40 */                if (methodI00IOO2 != null) {
/* 42 */                    return methodI00IOO2;
                        }
/* 43 */                if (z && (clsI00000oIO = lIlIilIioI.I00000oIO(OOo1Io0I0.I0000O(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
/* 65 */                    clsArr[0] = cls3;
/* 67 */                    Method methodI00Io1o110i2 = I00Io1o110i(clsI00000oIO, str, clsArr, cls2);
/* 71 */                    if (methodI00Io1o110i2 != null) {
/* 73 */                        return methodI00Io1o110i2;
                            }
                        }
                    }
/* 77 */            return null;
                }

                public static Constructor I00Io1lO(Class cls, ArrayList arrayList) {
                    try {
/* 8 */                 Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
/* 17 */                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
/* 22 */                return null;
                    }
                }

                public static Method I00Io1o110i(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
                    try {
/* 8 */                 Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
/* 20 */                if (O0000Ioio00.I0000O(declaredMethod.getReturnType(), cls2)) {
/* 22 */                    return declaredMethod;
                        }
/* 29 */                for (Method method : cls.getDeclaredMethods()) {
/* 41 */                    if (O0000Ioio00.I0000O(method.getName(), str) && O0000Ioio00.I0000O(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
/* 63 */                        return method;
                            }
                        }
/* 67 */                return null;
                    } catch (NoSuchMethodException unused) {
/* 67 */                return null;
                    }
                }

                public final Method I001lIiIIo1O(String str, String str2, boolean z) {
/* 7 */             if (str.equals("<init>")) {
/* 9 */                 return null;
                    }
/* 13 */            ArrayList arrayList = new ArrayList();
/* 16 */            if (z) {
/* 22 */                arrayList.add(I001l0I00());
                    }
/* 26 */            IIlio101Io iIlio101IoI00IioO0OiOi = I00IioO0OiOi(str2, true);
/* 35 */            I00000oIO(arrayList, (ArrayList) iIlio101IoI00IioO0OiOi.I00iiI, false);
/* 60 */            return I00IOO(I00IO1(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), (Class) iIlio101IoI00IioO0OiOi.I00iiO, z);
                }

                public final Method I001lllioOl(String str, String str2) throws NoSuchMethodException, SecurityException {
                    Method methodI00IOO;
/* 7 */             if (str.equals("<init>")) {
/* 62 */                return null;
                    }
/* 11 */            IIlio101Io iIlio101IoI00IioO0OiOi = I00IioO0OiOi(str2, true);
/* 26 */            Class[] clsArr = (Class[]) ((ArrayList) iIlio101IoI00IioO0OiOi.I00iiI).toArray(new Class[0]);
/* 30 */            Class cls = (Class) iIlio101IoI00IioO0OiOi.I00iiO;
/* 36 */            Method methodI00IOO2 = I00IOO(I00IO1(), str, clsArr, cls, false);
/* 40 */            if (methodI00IOO2 != null) {
/* 42 */                return methodI00IOO2;
                    }
/* 51 */            if (!I00IO1().isInterface() || (methodI00IOO = I00IOO(Object.class, str, clsArr, cls, false)) == null) {
/* 62 */                return null;
                    }
/* 61 */            return methodI00IOO;
                }

                public abstract Collection I001lloI();

                public abstract Collection I00II0Ol1O0l(OI1Iio0ii1 oI1Iio0ii1);

                public abstract OOOO01l I00II0oii1o(int i);

                public Class I00IO1() {
/* 11 */            Class cls = (Class) OOo1Io0I0.I0000Il00O.get(I001l0I00());
                    return cls == null ? I001l0I00() : cls;
                }

                public abstract Collection I00IO1oi11O(OI1Iio0ii1 oI1Iio0ii1);

                public final IIlio101Io I00IioO0OiOi(String str, boolean z) {
                    int iI001i1O0Ol;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 7 */             int i = 1;
/* 14 */            while (str.charAt(i) != ')') {
/* 16 */                int i2 = i;
/* 23 */                while (str.charAt(i2) == '[') {
/* 25 */                    i2++;
                        }
/* 28 */                char cCharAt = str.charAt(i2);
/* 38 */                if (OlOoOIi0o.I00100l0("VZCBSIFJD", cCharAt)) {
/* 40 */                    iI001i1O0Ol = i2 + 1;
                        } else {
/* 45 */                    if (cCharAt != 'L') {
/* 75 */                        throw new Ii01OOool("Unknown type prefix in the method signature: ".concat(str));
                            }
/* 54 */                    iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, ';', i, 4) + 1;
                        }
/* 59 */                arrayList.add(I00IlilI0i0i(i, iI001i1O0Ol, str));
/* 62 */                i = iI001i1O0Ol;
                    }
/* 88 */            Class clsI00IlilI0i0i = z ? I00IlilI0i0i(i + 1, str.length(), str) : null;
/* 93 */            IIlio101Io iIlio101Io = new IIlio101Io(16);
/* 96 */            iIlio101Io.I00iiI = arrayList;
/* 98 */            iIlio101Io.I00iiO = clsI00IlilI0i0i;
/* 100 */           VarHandle.storeStoreFence();
/* 551 */           return iIlio101Io;
                }

                public final Class I00IlilI0i0i(int i, int i2, String str) {
/* 1 */             char cCharAt = str.charAt(i);
/* 7 */             if (cCharAt == 'F') {
/* 123 */               return Float.TYPE;
                    }
/* 11 */            if (cCharAt == 'L') {
/* 118 */               return OOo1Io0I0.I0000O(I001l0I00()).loadClass(str.substring(i + 1, i2 - 1).replace('/', '.'));
                    }
/* 15 */            if (cCharAt == 'S') {
/* 91 */                return Short.TYPE;
                    }
/* 19 */            if (cCharAt == 'V') {
/* 88 */                return Void.TYPE;
                    }
/* 23 */            if (cCharAt == 'I') {
/* 85 */                return Integer.TYPE;
                    }
/* 27 */            if (cCharAt == 'J') {
/* 82 */                return Long.TYPE;
                    }
/* 31 */            if (cCharAt == 'Z') {
/* 79 */                return Boolean.TYPE;
                    }
/* 35 */            if (cCharAt == '[') {
/* 63 */                Class clsI00IlilI0i0i = I00IlilI0i0i(i + 1, i2, str);
/* 67 */                Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 74 */                return Array.newInstance((Class<?>) clsI00IlilI0i0i, 0).getClass();
                    }
                    switch (cCharAt) {
                        case 'B':
/* 58 */                    return Byte.TYPE;
                        case 'C':
/* 55 */                    return Character.TYPE;
                        case 'D':
/* 52 */                    return Double.TYPE;
                        default:
/* 51 */                    throw new Ii01OOool("Unknown type prefix in the method signature: ".concat(str));
                    }
                }
            }
