            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOll0l0IOO0o;", "LO1oooooIio;", "LOll1OII0o;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class Oll0l0IOO0o extends O1oooooIio {
                public final Object I00000oIO;
                public final Object I00000oOI;
                public final PointerInputEventHandler I0000Il00O;

                public Oll0l0IOO0o(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
/* 3 */             obj2 = (i & 2) != 0 ? null : obj2;
/* 9 */             this.I00000oIO = obj;
/* 11 */            this.I00000oOI = obj2;
/* 13 */            this.I0000Il00O = pointerInputEventHandler;
                }

                @Override
                public final O1ooOo I000II() {
/* 9 */             return new Oll1OII0o(this.I00000oIO, this.I00000oOI, this.I0000Il00O);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oll1OII0o oll1OII0o = (Oll1OII0o) o1ooOo;
/* 3 */             Object obj = oll1OII0o.I00o0iI0io1;
/* 5 */             Object obj2 = this.I00000oIO;
                    boolean z = !O0000Ioio00.I0000O(obj, obj2);
/* 13 */            oll1OII0o.I00o0iI0io1 = obj2;
/* 15 */            Object obj3 = oll1OII0o.I00o0l1o1o0;
/* 17 */            Object obj4 = this.I00000oOI;
/* 23 */            if (!O0000Ioio00.I0000O(obj3, obj4)) {
/* 25 */                z = true;
                    }
/* 26 */            oll1OII0o.I00o0l1o1o0 = obj4;
/* 30 */            Class<?> cls = oll1OII0o.I00o101lO.getClass();
/* 34 */            PointerInputEventHandler pointerInputEventHandler = this.I0000Il00O;
/* 44 */            if (cls == pointerInputEventHandler.getClass() ? z : true) {
/* 46 */                oll1OII0o.I010lI0oi();
                    }
/* 49 */            oll1OII0o.I00o101lO = pointerInputEventHandler;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oll0l0IOO0o)) {
/* 41 */                return false;
                    }
/* 9 */             Oll0l0IOO0o oll0l0IOO0o = (Oll0l0IOO0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oll0l0IOO0o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oll0l0IOO0o.I00000oOI) && this.I0000Il00O == oll0l0IOO0o.I0000Il00O;
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00000oIO;
/* 12 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
/* 14 */            Object obj2 = this.I00000oOI;
/* 31 */            return this.I0000Il00O.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
                }
            }
