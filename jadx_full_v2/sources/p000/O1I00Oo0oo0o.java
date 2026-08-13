            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class O1I00Oo0oo0o extends O1I01I0o implements OIO01OI0 {
                public volatile IoloOio0I I00iio;
                public final I00iiI I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1I00Oo0oo0o(O1I0OloI o1I0OloI, I01iiIii10O i01iiIii10O, I00iiI i00iiI) {
/* 6 */             super(o1I0OloI, i01iiIii10O);
/* 1 */             this.I00ilI0I1 = i00iiI;
/* 4 */             if (o1I0OloI == null) {
/* 13 */                I0001Ioi1lo(0);
/* 215 */               throw null;
                    }
/* 9 */             this.I00iio = null;
                }

                public static void I00000oIO(int i) {
/* 7 */             String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 14 */            Object[] objArr = new Object[i != 2 ? 2 : 3];
/* 19 */            if (i != 2) {
/* 21 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                    } else {
/* 26 */                objArr[0] = "value";
                    }
/* 29 */            if (i != 2) {
/* 33 */                objArr[1] = "recursionDetected";
                    } else {
/* 36 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                    }
/* 38 */            if (i == 2) {
/* 43 */                objArr[2] = "doPostCompute";
                    }
/* 45 */            String str2 = String.format(str, objArr);
/* 49 */            if (i == 2) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
                }

                public static void I0001Ioi1lo(int i) {
/* 7 */             String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 14 */            Object[] objArr = new Object[i != 2 ? 3 : 2];
/* 20 */            if (i == 1) {
/* 34 */                objArr[0] = "computable";
                    } else if (i != 2) {
/* 26 */                objArr[0] = "storageManager";
                    } else {
/* 29 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                    }
/* 36 */            if (i != 2) {
/* 38 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                    } else {
/* 43 */                objArr[1] = "invoke";
                    }
/* 45 */            if (i != 2) {
/* 49 */                objArr[2] = "<init>";
                    }
/* 51 */            String str2 = String.format(str, objArr);
/* 55 */            if (i == 2) {
/* 186 */               throw new IllegalStateException(str2);
                    }
                }

                @Override
                public final void I0000O(Object obj) {
/* 5 */             IoloOio0I ioloOio0I = new IoloOio0I(27);
/* 8 */             ioloOio0I.I00iiI = obj;
/* 14 */            ioloOio0I.I00iiO = Thread.currentThread();
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I00iio = ioloOio0I;
                    try {
/* 22 */                if (obj != null) {
/* 26 */                    this.I00ilI0I1.invoke(obj);
                        } else {
/* 35 */                    I00000oIO(2);
/* 38 */                    throw null;
                        }
                    } finally {
/* 39 */                this.I00iio = null;
                    }
                }

                @Override
                public final IIOo1i I0000oI00(boolean z) {
/* 18 */            return new IIOo1i(7, (Object) new I01ilI00oIi(Collections.singletonList(Il0ooiloI.I0000O)), false);
                }

                @Override
                public final Object invoke() throws Throwable {
                    Object objInvoke;
/* 1 */             IoloOio0I ioloOio0I = this.I00iio;
/* 4 */             if (ioloOio0I == null || ((Thread) ioloOio0I.I00iiO) != Thread.currentThread()) {
/* 36 */                objInvoke = super.invoke();
                    } else if (((Thread) ioloOio0I.I00iiO) == Thread.currentThread()) {
/* 26 */                objInvoke = ioloOio0I.I00iiI;
                    } else {
/* 31 */                I000II.I001IO000("No value in this thread (hasValue should be checked before)");
/* 34 */                objInvoke = null;
                    }
/* 40 */            if (objInvoke != null) {
/* 42 */                return objInvoke;
                    }
/* 44 */            I0001Ioi1lo(2);
/* 113 */           throw null;
                }
            }
