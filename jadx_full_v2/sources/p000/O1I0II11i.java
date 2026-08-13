            package p000;
            
            public class O1I0II11i extends O1I01I0o implements OIO01OI0 {
                @Override
                public final Object invoke() throws Throwable {
/* 1 */             Object objInvoke = super.invoke();
/* 5 */             if (objInvoke != null) {
/* 7 */                 return objInvoke;
                    }
/* 113 */           throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
                }
            }
