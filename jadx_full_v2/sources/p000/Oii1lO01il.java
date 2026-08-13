            package p000;

            import com.google.ai.edge.gallery.data.ConfigEditorType;
            import com.google.ai.edge.gallery.data.ValueType;
            import java.util.ArrayList;
            
/* 15 */    public final class Oii1lO01il extends IOlOo10O0l0 {
                public final IOllO1I I0000Il00O;
                public final String I0000O;
                public final ArrayList I0000oI00;
                public final boolean I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oii1lO01il(IOllO1I iOllO1I, String str, ArrayList arrayList, boolean z) {
/* 5 */             super(str, ValueType.STRING);
/* 1 */             ConfigEditorType configEditorType = ConfigEditorType.LABEL;
/* 8 */             this.I0000Il00O = iOllO1I;
/* 10 */            this.I0000O = str;
/* 12 */            this.I0000oI00 = arrayList;
/* 14 */            this.I0001Ioi1lo = z;
                }

                @Override
                public final Object I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final IOllO1I I00000oOI() {
/* 1 */             return this.I0000Il00O;
                }

/* 16 */        public Oii1lO01il(String str, ArrayList arrayList) {
/* 17 */            this(iIIiO0.I00100l0, str, arrayList, false);
                }
            }
