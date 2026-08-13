            package p000;
            
            public final class Il1lIi extends I01O1lIi {
                public final IIiIoIl11IO I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il1lIi(IIiIoIl11IO iIiIoIl11IO, O0iIl1 o0iIl1) {
/* 3 */             super(o0iIl1);
/* 1 */             if (o0iIl1 == null) {
/* 89 */                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
                    }
/* 6 */             this.I00iiI = iIiIoIl11IO;
                }

                public final String toString() {
/* 28 */            return getType() + ": Ext {" + this.I00iiI + "}";
                }
            }
