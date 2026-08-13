            package p000;

            import com.google.ai.edge.gallery.data.ConfigEditorType;
            import com.google.ai.edge.gallery.data.ValueType;
            
            public final class OIOOoO1O1oO extends IOlOo10O0l0 {
                public final IOllO1I I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final float I0001Ioi1lo;
                public final ValueType I000II;
                public final boolean I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OIOOoO1O1oO(IOllO1I iOllO1I, float f, float f2, float f3, ValueType valueType, boolean z) {
/* 7 */             super(Float.valueOf(f3), valueType);
/* 1 */             ConfigEditorType configEditorType = ConfigEditorType.LABEL;
/* 10 */            this.I0000Il00O = iOllO1I;
/* 12 */            this.I0000O = f;
/* 14 */            this.I0000oI00 = f2;
/* 16 */            this.I0001Ioi1lo = f3;
/* 18 */            this.I000II = valueType;
/* 20 */            this.I000O01llI0 = z;
                }

                @Override
                public final Object I00000oIO() {
/* 3 */             return Float.valueOf(this.I0001Ioi1lo);
                }

                @Override
                public final IOllO1I I00000oOI() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I000O01llI0;
                }

                @Override
                public final ValueType I0000O() {
/* 1 */             return this.I000II;
                }
            }
