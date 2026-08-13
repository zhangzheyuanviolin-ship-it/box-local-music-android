            package p000;

            import com.google.ai.edge.gallery.data.ConfigEditorType;
            import com.google.ai.edge.gallery.data.ValueType;
            
/* 11 */    public final class O0iO0Oii0o00 extends IOlOo10O0l0 {
                public final IOllO1I I0000Il00O;
                public final String I0000O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0iO0Oii0o00(IOllO1I iOllO1I, String str) {
/* 5 */             super(str, ValueType.STRING);
/* 1 */             ConfigEditorType configEditorType = ConfigEditorType.LABEL;
/* 8 */             this.I0000Il00O = iOllO1I;
/* 10 */            this.I0000O = str;
                }

                @Override
                public final Object I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final IOllO1I I00000oOI() {
/* 1 */             return this.I0000Il00O;
                }

/* 12 */        public O0iO0Oii0o00(IOllO1I iOllO1I) {
/* 13 */            this(iOllO1I, "");
                }
            }
