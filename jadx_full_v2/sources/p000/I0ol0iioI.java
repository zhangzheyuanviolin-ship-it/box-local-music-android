            package p000;

            import android.text.Layout;
            import android.text.TextPaint;
            import java.text.BreakIterator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.PriorityQueue;
            
            public final class I0ol0iioI implements OIoiOo11o {
                public String I00iOIl;
                public Oo0lloOiiIOI I00iiI;
                public List I00iiO;
                public List I00iio;
                public IliO0o11i01 I00ilI0I1;
                public IiIooOOOI I00ilO0;
                public boolean I00io1l;
                public I100o1l I00ioIO;
                public CharSequence I00l0I0l0lO1;
                public O0iOlIOIl0 I00l0OO0IO;
                public Oo1ol1ll I00li1OI;
                public boolean I00ll1;
                public int I00lli11;
                public int I00lll10;

                public final boolean I00000oIO() {
/* 1 */             String str = this.I00iOIl;
/* 3 */             int i = this.I00lll10;
/* 8 */             if (i == -1) {
/* 29 */                i = (str.length() > 512 || OlOoOIi0o.I00100l0(str, '\n')) ? 1 : 0;
/* 30 */                this.I00lll10 = i;
                    }
                    return i == 1;
                }

                @Override
                public final boolean I0000O() {
/* 1 */             Oo1ol1ll oo1ol1ll = this.I00li1OI;
/* 12 */            if (oo1ol1ll != null ? oo1ol1ll.I000OiO() : false) {
/* 66 */                return true;
                    }
/* 16 */            if (!this.I00ll1 && l1o1o11OIIOo.I00000oOI(this.I00iiI)) {
/* 26 */                Oi0Oooi oi0Oooi = Iioo1i0.I00000oIO;
/* 28 */                Oi0Oooi oi0Oooi2 = Iioo1i0.I00000oIO;
/* 32 */                OlO01l1oOil olO01l1oOilI0010I0i = (OlO01l1oOil) oi0Oooi2.I00iiI;
/* 34 */                if (olO01l1oOilI0010I0i == null) {
/* 41 */                    if (IiollO1llli.I0000O()) {
/* 43 */                        olO01l1oOilI0010I0i = oi0Oooi2.I0010I0i();
/* 47 */                        oi0Oooi2.I00iiI = olO01l1oOilI0010I0i;
                            } else {
/* 50 */                        olO01l1oOilI0010I0i = iIO0o0oOo00.I00000oIO;
                            }
                        }
/* 62 */                if (((Boolean) olO01l1oOilI0010I0i.getValue()).booleanValue()) {
/* 66 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final float I000II() {
/* 1 */             O0iOlIOIl0 o0iOlIOIl0 = this.I00l0OO0IO;
/* 3 */             float f = o0iOlIOIl0.I0000oI00;
/* 5 */             TextPaint textPaint = o0iOlIOIl0.I00000oOI;
/* 11 */            if (!Float.isNaN(f)) {
/* 13 */                return o0iOlIOIl0.I0000oI00;
                    }
/* 20 */            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
/* 26 */            CharSequence charSequence = o0iOlIOIl0.I00000oIO;
/* 35 */            lineInstance.setText(new IO11o1i0olIO(charSequence.length(), charSequence));
/* 44 */            PriorityQueue priorityQueue = new PriorityQueue(10, iIoIl1ioI1.I00000oIO);
/* 51 */            int i = 0;
/* 53 */            for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
/* 60 */                if (priorityQueue.size() < 10) {
/* 67 */                    priorityQueue.add(new IooO11l(i, next, 1));
                        } else {
/* 75 */                    IooO11l iooO11l = (IooO11l) priorityQueue.peek();
/* 77 */                    if (iooO11l != null && iooO11l.I00iiI - iooO11l.I00iOIl < next - i) {
/* 88 */                        priorityQueue.poll();
/* 96 */                        priorityQueue.add(new IooO11l(i, next, 1));
                            }
                        }
/* 104 */               i = next;
                    }
/* 111 */           float desiredWidth = 0.0f;
/* 112 */           if (!priorityQueue.isEmpty()) {
/* 115 */               Iterator it = priorityQueue.iterator();
/* 123 */               if (!it.hasNext()) {
/* 176 */                   IoOOl0iOl1io.I00000oOI();
/* 111 */                   return 0.0f;
                        }
/* 129 */               IooO11l iooO11l2 = (IooO11l) it.next();
/* 139 */               desiredWidth = Layout.getDesiredWidth(o0iOlIOIl0.I00000oIO(), iooO11l2.I00iOIl, iooO11l2.I00iiI, textPaint);
/* 148 */               while (it.hasNext()) {
/* 154 */                   IooO11l iooO11l3 = (IooO11l) it.next();
/* 168 */                   desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(o0iOlIOIl0.I00000oIO(), iooO11l3.I00iOIl, iooO11l3.I00iiI, textPaint));
                        }
                    }
/* 173 */           o0iOlIOIl0.I0000oI00 = desiredWidth;
/* 175 */           return desiredWidth;
                }

                @Override
                public final float I000l1() {
/* 3 */             return this.I00l0OO0IO.I00000oOI();
                }
            }
