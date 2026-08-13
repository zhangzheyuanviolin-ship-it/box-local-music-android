            package p000;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            
            public final class IOo1o0lI implements InvocationHandler {
                public O0IOli0o0 I00000oIO;
                public Il1oIOO0l I00000oOI;

                @Override
                public final Object invoke(Object obj, Method method, Object[] objArr) {
/* 1 */             Il1oIOO0l il1oIOO0l = this.I00000oOI;
/* 15 */            if (O0000Ioio00.I0000O(method.getName(), "accept") && objArr != null && objArr.length == 1) {
/* 22 */                O0IOli0o0 o0IOli0o0 = this.I00000oIO;
/* 24 */                Object obj2 = objArr[0];
/* 30 */                if (o0IOli0o0.I001i1O0Ol(obj2)) {
/* 32 */                    il1oIOO0l.invoke(obj2);
/* 35 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 61 */                throw new ClassCastException("Value cannot be cast to " + o0IOli0o0.I000O01llI0());
                    }
/* 72 */            if (O0000Ioio00.I0000O(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
/* 96 */                return Boolean.valueOf(obj == objArr[0]);
                    }
/* 111 */           if (O0000Ioio00.I0000O(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
/* 131 */               return Integer.valueOf(il1oIOO0l.hashCode());
                    }
/* 146 */           if (O0000Ioio00.I0000O(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
/* 162 */               return il1oIOO0l.toString();
                    }
/* 408 */           throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
                }
            }
