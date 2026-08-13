            package p000;

            import java.io.Serializable;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
/* 7 */     public abstract class I1oI1lil implements IOoil1iiIilo, Ii011lOOlI1, Serializable {
                private final IOoil1iiIilo completion;

                public I1oI1lil(IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             this.completion = iOoil1iiIilo;
                }

                public IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 49 */            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
                }

                @Override
                public Ii011lOOlI1 getCallerFrame() {
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.completion;
/* 5 */             if (iOoil1iiIilo instanceof Ii011lOOlI1) {
/* 7 */                 return (Ii011lOOlI1) iOoil1iiIilo;
                    }
/* 10 */            return null;
                }

                public final IOoil1iiIilo getCompletion() {
/* 1 */             return this.completion;
                }

                public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
                    int iIntValue;
                    String strM0c;
                    Method method;
                    Object objInvoke;
                    Method method2;
                    Object objInvoke2;
/* 11 */            Ii1OliO0l ii1OliO0l = (Ii1OliO0l) getClass().getAnnotation(Ii1OliO0l.class);
/* 13 */            String str = null;
/* 14 */            if (ii1OliO0l == null || ii1OliO0l.m4v() < 1) {
/* 13 */                return null;
                    }
                    try {
/* 32 */                Field declaredField = getClass().getDeclaredField("label");
/* 36 */                declaredField.setAccessible(true);
/* 39 */                Object obj = declaredField.get(this);
/* 50 */                Integer num = obj instanceof Integer ? (Integer) obj : null;
/* 59 */                iIntValue = (num != null ? num.intValue() : 0) - 1;
                    } catch (Exception unused) {
/* 61 */                iIntValue = -1;
                    }
/* 69 */            int i = iIntValue >= 0 ? ii1OliO0l.m2l()[iIntValue] : -1;
/* 71 */            IoIlOo1o0IIl ioIlOo1o0IIl = iO000OI0lOl.I00000oOI;
/* 73 */            IoIlOo1o0IIl ioIlOo1o0IIl2 = iO000OI0lOl.I00000oIO;
/* 75 */            if (ioIlOo1o0IIl == null) {
                        try {
/* 129 */                   IoIlOo1o0IIl ioIlOo1o0IIl3 = new IoIlOo1o0IIl(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 19);
/* 132 */                   iO000OI0lOl.I00000oOI = ioIlOo1o0IIl3;
/* 134 */                   ioIlOo1o0IIl = ioIlOo1o0IIl3;
                        } catch (Exception unused2) {
/* 136 */                   iO000OI0lOl.I00000oOI = ioIlOo1o0IIl2;
/* 138 */                   ioIlOo1o0IIl = ioIlOo1o0IIl2;
                        }
                    }
/* 139 */           if (ioIlOo1o0IIl != ioIlOo1o0IIl2 && (method = (Method) ioIlOo1o0IIl.I00iiI) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) ioIlOo1o0IIl.I00iiO) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
/* 174 */               Method method3 = (Method) ioIlOo1o0IIl.I00iio;
/* 183 */               Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
/* 186 */               if (objInvoke3 instanceof String) {
/* 189 */                   str = (String) objInvoke3;
                        }
                    }
/* 191 */           if (str == null) {
/* 193 */               strM0c = ii1OliO0l.m0c();
                    } else {
/* 215 */               strM0c = str + '/' + ii1OliO0l.m0c();
                    }
/* 229 */           return new StackTraceElement(strM0c, ii1OliO0l.m3m(), ii1OliO0l.m1f(), i);
                }

                public abstract Object invokeSuspend(Object obj);

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void resumeWith(Object obj) {
                    while (true) {
/* 1 */                 I1oI1lil i1oI1lil = this;
/* 3 */                 IOoil1iiIilo iOoil1iiIilo = i1oI1lil.completion;
                        try {
/* 5 */                     obj = i1oI1lil.invokeSuspend(obj);
/* 11 */                    if (obj == Ii0111o.I00iOIl) {
/* 13 */                        return;
                            }
                        } catch (Throwable th) {
/* 15 */                    obj = lIoii1l01l0i.I00000oIO(th);
                        }
/* 19 */                i1oI1lil.releaseIntercepted();
/* 24 */                if (!(iOoil1iiIilo instanceof I1oI1lil)) {
/* 28 */                    iOoil1iiIilo.resumeWith(obj);
/* 49 */                    return;
                        }
/* 26 */                this = iOoil1iiIilo;
                    }
                }

                public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
/* 5 */             StringBuilder sb = new StringBuilder("Continuation at ");
/* 8 */             Object stackTraceElement = getStackTraceElement();
/* 12 */            if (stackTraceElement == null) {
/* 18 */                stackTraceElement = getClass().getName();
                    }
/* 22 */            sb.append(stackTraceElement);
/* 25 */            return sb.toString();
                }

/* 8 */         public IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
                }

/* 28 */        public void releaseIntercepted() {
                }
            }
