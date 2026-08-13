            package p000;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            
            public final class O0101Ill1 implements InvocationHandler {
                public ArrayList I00000oIO;
                public boolean I00000oOI;
                public String I0000Il00O;

                @Override
                public final Object invoke(Object obj, Method method, Object[] objArr) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 4 */             if (objArr == null) {
/* 6 */                 objArr = new Object[0];
                    }
/* 8 */             String name = method.getName();
/* 12 */            Class<?> returnType = method.getReturnType();
/* 22 */            if (O0000Ioio00.I0000O(name, "supports") && O0000Ioio00.I0000O(Boolean.TYPE, returnType)) {
/* 32 */                return Boolean.TRUE;
                    }
/* 43 */            if (O0000Ioio00.I0000O(name, "unsupported") && O0000Ioio00.I0000O(Void.TYPE, returnType)) {
/* 53 */                this.I00000oOI = true;
/* 41 */                return null;
                    }
/* 62 */            if (O0000Ioio00.I0000O(name, "protocols") && objArr.length == 0) {
/* 67 */                return arrayList;
                    }
/* 74 */            if ((O0000Ioio00.I0000O(name, "selectProtocol") || O0000Ioio00.I0000O(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
/* 95 */                Object obj2 = objArr[0];
/* 99 */                if (obj2 instanceof List) {
/* 101 */                   List list = (List) obj2;
/* 103 */                   int size = list.size();
/* 107 */                   if (size >= 0) {
/* 109 */                       int i = 0;
                                while (true) {
/* 114 */                           String str = (String) list.get(i);
/* 120 */                           if (!arrayList.contains(str)) {
/* 125 */                               if (i == size) {
                                            break;
                                        }
/* 127 */                               i++;
                                    } else {
/* 122 */                               this.I0000Il00O = str;
/* 124 */                               return str;
                                    }
                                }
                            }
/* 134 */                   String str2 = (String) arrayList.get(0);
/* 136 */                   this.I0000Il00O = str2;
/* 138 */                   return str2;
                        }
                    }
/* 145 */           if ((!O0000Ioio00.I0000O(name, "protocolSelected") && !O0000Ioio00.I0000O(name, "selected")) || objArr.length != 1) {
/* 170 */               return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                    }
/* 162 */           this.I0000Il00O = (String) objArr[0];
/* 41 */            return null;
                }
            }
