            package p000;

            import android.text.Editable;
            import android.text.SpannableStringBuilder;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 3 */     public final class OlIIiioli01 extends SpannableStringBuilder {
                public Class I00iOIl;
                public ArrayList I00iiI;

                public final void I00000oIO() {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 8 */             for (int i = 0; i < arrayList.size(); i++) {
/* 18 */                ((OlIIii1O) arrayList.get(i)).I00iiI.incrementAndGet();
                    }
                }

                public final void I00000oOI() {
/* 1 */             I0000oI00();
/* 4 */             ArrayList arrayList = this.I00iiI;
/* 12 */            for (int i = 0; i < arrayList.size(); i++) {
/* 28 */                ((OlIIii1O) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                    }
                }

                public final OlIIii1O I0000Il00O(Object obj) {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 8 */             for (int i = 0; i < arrayList.size(); i++) {
/* 14 */                OlIIii1O olIIii1O = (OlIIii1O) arrayList.get(i);
/* 18 */                if (olIIii1O.I00iOIl == obj) {
/* 20 */                    return olIIii1O;
                        }
                    }
/* 24 */            return null;
                }

                public final boolean I0000O(Object obj) {
/* 1 */             if (obj != null) {
                        return this.I00iOIl == obj.getClass();
                    }
/* 13 */            return false;
                }

                public final void I0000oI00() {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 8 */             for (int i = 0; i < arrayList.size(); i++) {
/* 18 */                ((OlIIii1O) arrayList.get(i)).I00iiI.decrementAndGet();
                    }
                }

                @Override
                public final Editable append(CharSequence charSequence) {
/* 1 */             super.append(charSequence);
/* 29 */            return this;
                }

                @Override
                public final Editable delete(int i, int i2) {
/* 1 */             super.delete(i, i2);
/* 37 */            return this;
                }

                @Override
                public final int getSpanEnd(Object obj) {
                    OlIIii1O olIIii1OI0000Il00O;
/* 5 */             if (I0000O(obj) && (olIIii1OI0000Il00O = I0000Il00O(obj)) != null) {
/* 13 */                obj = olIIii1OI0000Il00O;
                    }
/* 14 */            return super.getSpanEnd(obj);
                }

                @Override
                public final int getSpanFlags(Object obj) {
                    OlIIii1O olIIii1OI0000Il00O;
/* 5 */             if (I0000O(obj) && (olIIii1OI0000Il00O = I0000Il00O(obj)) != null) {
/* 13 */                obj = olIIii1OI0000Il00O;
                    }
/* 14 */            return super.getSpanFlags(obj);
                }

                @Override
                public final int getSpanStart(Object obj) {
                    OlIIii1O olIIii1OI0000Il00O;
/* 5 */             if (I0000O(obj) && (olIIii1OI0000Il00O = I0000Il00O(obj)) != null) {
/* 13 */                obj = olIIii1OI0000Il00O;
                    }
/* 14 */            return super.getSpanStart(obj);
                }

                @Override
                public final Object[] getSpans(int i, int i2, Class cls) {
/* 3 */             if (this.I00iOIl != cls) {
/* 34 */                return super.getSpans(i, i2, cls);
                    }
/* 11 */            OlIIii1O[] olIIii1OArr = (OlIIii1O[]) super.getSpans(i, i2, OlIIii1O.class);
/* 18 */            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, olIIii1OArr.length);
/* 22 */            for (int i3 = 0; i3 < olIIii1OArr.length; i3++) {
/* 28 */                objArr[i3] = olIIii1OArr[i3].I00iOIl;
                    }
/* 33 */            return objArr;
                }

                @Override
                public final Editable insert(int i, CharSequence charSequence) {
/* 1 */             super.insert(i, charSequence);
/* 37 */            return this;
                }

                @Override
                public final int nextSpanTransition(int i, int i2, Class cls) {
/* 1 */             if (cls == null || this.I00iOIl == cls) {
/* 7 */                 cls = OlIIii1O.class;
                    }
/* 9 */             return super.nextSpanTransition(i, i2, cls);
                }

                @Override
                public final void removeSpan(Object obj) {
                    OlIIii1O olIIii1OI0000Il00O;
/* 5 */             if (I0000O(obj)) {
/* 7 */                 olIIii1OI0000Il00O = I0000Il00O(obj);
/* 11 */                if (olIIii1OI0000Il00O != null) {
/* 13 */                    obj = olIIii1OI0000Il00O;
                        }
                    } else {
/* 15 */                olIIii1OI0000Il00O = null;
                    }
/* 16 */            super.removeSpan(obj);
/* 19 */            if (olIIii1OI0000Il00O != null) {
/* 23 */                this.I00iiI.remove(olIIii1OI0000Il00O);
                    }
                }

                @Override
                public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
/* 1 */             I00000oIO();
/* 4 */             super.replace(i, i2, charSequence);
/* 7 */             I0000oI00();
/* 98 */            return this;
                }

                @Override
                public final void setSpan(Object obj, int i, int i2, int i3) {
/* 5 */             if (I0000O(obj)) {
/* 9 */                 OlIIii1O olIIii1O = new OlIIii1O();
/* 18 */                olIIii1O.I00iiI = new AtomicInteger(0);
/* 20 */                olIIii1O.I00iOIl = obj;
/* 22 */                VarHandle.storeStoreFence();
/* 27 */                this.I00iiI.add(olIIii1O);
/* 30 */                obj = olIIii1O;
                    }
/* 31 */            super.setSpan(obj, i, i2, i3);
                }

                @Override
                public final CharSequence subSequence(int i, int i2) {
/* 3 */             Class cls = this.I00iOIl;
/* 5 */             OlIIiioli01 olIIiioli01 = new OlIIiioli01(this, i, i2);
/* 13 */            olIIiioli01.I00iiI = new ArrayList();
/* 17 */            lII1OI11o1I.I0000O("watcherClass cannot be null", cls);
/* 20 */            olIIiioli01.I00iOIl = cls;
/* 22 */            VarHandle.storeStoreFence();
/* 37 */            return olIIiioli01;
                }

                @Override
/* 4 */         public final SpannableStringBuilder append(CharSequence charSequence) {
/* 5 */             super.append(charSequence);
                    return this;
                }

                @Override
/* 4 */         public final SpannableStringBuilder delete(int i, int i2) {
/* 5 */             super.delete(i, i2);
                    return this;
                }

                @Override
/* 4 */         public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
/* 5 */             super.insert(i, charSequence);
                    return this;
                }

                @Override
/* 5 */         public final Appendable append(CharSequence charSequence) {
/* 6 */             super.append(charSequence);
                    return this;
                }

                @Override
/* 5 */         public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
/* 6 */             super.insert(i, charSequence, i2, i3);
                    return this;
                }

                @Override
/* 6 */         public final Editable append(char c) {
/* 7 */             super.append(c);
                    return this;
                }

                @Override
/* 6 */         public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
/* 7 */             super.insert(i, charSequence, i2, i3);
                    return this;
                }

                @Override
/* 7 */         public final SpannableStringBuilder append(char c) {
/* 8 */             super.append(c);
                    return this;
                }

                @Override
/* 8 */         public final Appendable append(char c) {
/* 9 */             super.append(c);
                    return this;
                }

                @Override
/* 9 */         public final Editable append(CharSequence charSequence, int i, int i2) {
/* 10 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override
/* 10 */        public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
/* 11 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override
/* 10 */        public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
/* 11 */            replace(i, i2, charSequence, i3, i4);
                    return this;
                }

                @Override
/* 11 */        public final Appendable append(CharSequence charSequence, int i, int i2) {
/* 12 */            super.append(charSequence, i, i2);
                    return this;
                }

                @Override
/* 11 */        public final Editable replace(int i, int i2, CharSequence charSequence) {
/* 12 */            replace(i, i2, charSequence);
                    return this;
                }

                @Override
/* 12 */        public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
/* 13 */            super.append(charSequence, obj, i);
                    return this;
                }

                @Override
/* 12 */        public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
/* 13 */            I00000oIO();
/* 14 */            super.replace(i, i2, charSequence, i3, i4);
/* 15 */            I0000oI00();
                    return this;
                }
            }
