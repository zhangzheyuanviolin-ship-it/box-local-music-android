            package p000;

            import android.util.SparseBooleanArray;
            import android.util.SparseLongArray;
            import android.view.MotionEvent;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class OI01OO {
                public long I00000oIO;
                public SparseLongArray I00000oOI;
                public SparseBooleanArray I0000Il00O;
                public ArrayList I0000O;
                public O1IOillioo0I I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public OIOlIiiioi I000OiO;

                public final void I00000oIO(MotionEvent motionEvent) {
/* 1 */             SparseLongArray sparseLongArray = this.I00000oOI;
/* 3 */             int actionMasked = motionEvent.getActionMasked();
/* 9 */             if (actionMasked != 0 && actionMasked != 5) {
/* 16 */                if (actionMasked != 9) {
/* 77 */                    return;
                        }
/* 20 */                int pointerId = motionEvent.getPointerId(0);
/* 28 */                if (sparseLongArray.indexOfKey(pointerId) < 0) {
/* 30 */                    long j = this.I00000oIO;
/* 33 */                    this.I00000oIO = 1 + j;
/* 35 */                    sparseLongArray.put(pointerId, j);
/* 38 */                    return;
                        }
/* 77 */                return;
                    }
/* 39 */            int actionIndex = motionEvent.getActionIndex();
/* 43 */            int pointerId2 = motionEvent.getPointerId(actionIndex);
/* 51 */            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
/* 53 */                long j2 = this.I00000oIO;
/* 56 */                this.I00000oIO = 1 + j2;
/* 58 */                sparseLongArray.put(pointerId2, j2);
/* 66 */                if (motionEvent.getToolType(actionIndex) == 3) {
/* 71 */                    this.I0000Il00O.put(pointerId2, true);
                        }
                    }
                }

                public final void I00000oOI(MotionEvent motionEvent) {
/* 6 */             if (motionEvent.getPointerCount() != 1) {
/* 27 */                return;
                    }
/* 10 */            int toolType = motionEvent.getToolType(0);
/* 14 */            int source = motionEvent.getSource();
/* 20 */            if (toolType == this.I0001Ioi1lo && source == this.I000II) {
/* 27 */                return;
                    }
/* 28 */            this.I0001Ioi1lo = toolType;
/* 30 */            this.I000II = source;
/* 34 */            this.I0000Il00O.clear();
/* 39 */            this.I00000oOI.clear();
                }

                public final IoloOio0I I0000Il00O(MotionEvent motionEvent, I0lio1O01i01 i0lio1O01i01) {
                    int actionIndex;
/* 3 */             SparseBooleanArray sparseBooleanArray = this.I0000Il00O;
/* 5 */             ArrayList arrayList = this.I0000O;
/* 7 */             int actionMasked = motionEvent.getActionMasked();
/* 14 */            if (actionMasked == 3 || actionMasked == 4) {
/* 367 */               this.I00000oOI.clear();
/* 370 */               sparseBooleanArray.clear();
/* 373 */               this.I000O01llI0 = false;
/* 375 */               this.I000OOo1O = false;
/* 377 */               this.I000OiO = null;
/* 11 */                return null;
                    }
/* 19 */            I00000oOI(motionEvent);
/* 22 */            I00000oIO(motionEvent);
/* 40 */            boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
/* 47 */            boolean z2 = actionMasked == 8;
/* 48 */            if (z) {
/* 58 */                sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                    }
/* 61 */            if (actionMasked != 1) {
/* 69 */                actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
                    } else {
/* 74 */                actionIndex = 0;
                    }
/* 75 */            arrayList.clear();
/* 83 */            if (motionEvent.getActionMasked() == 0) {
/* 100 */               boolean z3 = motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5;
/* 126 */               boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
/* 127 */               if (z3 || z4) {
/* 131 */                   this.I000O01llI0 = true;
                        }
                    }
/* 137 */           if (motionEvent.getClassification() != 3 && motionEvent.getClassification() != 5) {
/* 146 */               this.I000OOo1O = false;
/* 148 */               int pointerCount = motionEvent.getPointerCount();
/* 152 */               int i = 0;
/* 153 */               while (i < pointerCount) {
/* 178 */                   arrayList.add(I0000O(i0lio1O01i01, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
/* 181 */                   i++;
                        }
                    } else {
/* 188 */               if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
/* 200 */                   if (motionEvent.getActionMasked() == 1) {
/* 202 */                       this.I000O01llI0 = false;
/* 204 */                       this.I000OOo1O = false;
/* 206 */                       this.I000OiO = null;
                            }
/* 208 */                   I0000oI00(motionEvent);
/* 11 */                    return null;
                        }
/* 212 */               this.I000OOo1O = true;
/* 225 */               if (motionEvent.getActionMasked() == 0) {
/* 227 */                   float rawX = motionEvent.getRawX(0);
/* 254 */                   this.I000OiO = OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(motionEvent.getRawY(0)) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
                        } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
/* 287 */                   float rawX2 = (motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f;
/* 316 */                   this.I000OiO = OIOlIiiioi.I00000oIO((Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(rawX2) << 32));
                        }
/* 329 */               arrayList.add(I0000O(i0lio1O01i01, motionEvent, this.I000OiO, 0, false));
                    }
/* 336 */           if (motionEvent.getActionMasked() == 1) {
/* 338 */               this.I000O01llI0 = false;
/* 340 */               this.I000OOo1O = false;
/* 342 */               this.I000OiO = null;
                    }
/* 344 */           I0000oI00(motionEvent);
/* 349 */           motionEvent.getEventTime();
/* 354 */           IoloOio0I ioloOio0I = new IoloOio0I(23);
/* 357 */           ioloOio0I.I00iiI = arrayList;
/* 359 */           ioloOio0I.I00iiO = motionEvent;
/* 361 */           VarHandle.storeStoreFence();
/* 364 */           return ioloOio0I;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x017a A[EDGE_INSN: B:74:0x017a->B:56:0x017a BREAK  A[LOOP:0: B:39:0x00e5->B:55:0x0174], SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r46v1 */
                /* JADX WARN: Type inference failed for: r46v3 */
                /* JADX WARN: Type inference failed for: r46v4 */
                /* JADX WARN: Type inference failed for: r46v5 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OO1il1IIii I0000O(I0lio1O01i01 i0lio1O01i01, MotionEvent motionEvent, OIOlIiiioi oIOlIiiioi, int i, boolean z) {
                    long jValueAt;
                    boolean z2;
                    long jFloatToRawIntBits;
                    boolean z3;
                    long j;
                    long jI00IO1;
                    ?? r46;
                    long j2;
                    int i2;
                    int historySize;
                    int i3;
                    long jFloatToRawIntBits2;
                    float fFloatValue;
                    long j3;
                    Float fValueOf;
                    int i4;
                    long j4;
/* 11 */            int pointerId = motionEvent.getPointerId(i);
/* 15 */            SparseLongArray sparseLongArray = this.I00000oOI;
/* 17 */            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
/* 21 */            if (iIndexOfKey >= 0) {
/* 23 */                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
/* 28 */                long j5 = this.I00000oIO;
/* 33 */                this.I00000oIO = 1 + j5;
/* 35 */                sparseLongArray.put(pointerId, j5);
/* 38 */                jValueAt = j5;
                    }
/* 39 */            float pressure = motionEvent.getPressure(i);
/* 70 */            long jFloatToRawIntBits3 = (Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
/* 71 */            if (i == 0) {
/* 73 */                if (oIOlIiiioi != null) {
/* 78 */                    z3 = 32;
/* 75 */                    jFloatToRawIntBits = oIOlIiiioi.I00000oIO;
/* 80 */                    j4 = 4294967295L;
                        } else {
/* 82 */                    float rawX = motionEvent.getRawX();
/* 86 */                    float rawY = motionEvent.getRawY();
/* 95 */                    j4 = 4294967295L;
/* 90 */                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(rawX);
/* 97 */                    int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
/* 101 */                   z3 = 32;
/* 108 */                   jFloatToRawIntBits = (iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits4 << 32);
                        }
/* 113 */               j = j4;
/* 109 */               jI00IO1 = i0lio1O01i01.I00IO1(jFloatToRawIntBits);
                    } else {
/* 119 */               if (oIOlIiiioi != null) {
/* 121 */                   jFloatToRawIntBits = oIOlIiiioi.I00000oIO;
/* 123 */                   z2 = 32;
                        } else {
/* 142 */                   z2 = 32;
/* 146 */                   jFloatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX(i)) << 32);
                        }
/* 152 */               z3 = z2;
/* 155 */               j = 4294967295L;
/* 148 */               jI00IO1 = i0lio1O01i01.I00IO1(jFloatToRawIntBits);
                    }
/* 159 */           int toolType = motionEvent.getToolType(i);
/* 164 */           if (toolType != 0) {
/* 166 */               ?? r462 = z3;
/* 168 */               i2 = 2;
                        j2 = r462;
/* 170 */               if (toolType != 1) {
/* 172 */                   if (toolType == 2) {
/* 181 */                       i2 = 3;
                                j2 = r462;
                            } else if (toolType != 3) {
/* 176 */                       i2 = 4;
                                r46 = r462;
                                j2 = r462;
/* 177 */                       if (toolType != 4) {
                                }
                            }
                        } else if (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) {
                            j2 = r462;
/* 202 */                   if (this.I000O01llI0) {
                                j2 = r462;
/* 206 */                       if (!this.I000OOo1O) {
/* 209 */                           i2 = 1;
                                    j2 = r462;
                                }
                            }
                        }
/* 220 */               ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
/* 223 */               historySize = motionEvent.getHistorySize();
/* 229 */               i3 = 0;
                        while (true) {
/* 238 */                   if (i3 < historySize) {
                                break;
                            }
/* 240 */                   float historicalX = motionEvent.getHistoricalX(i, i3);
/* 244 */                   float historicalY = motionEvent.getHistoricalY(i, i3);
/* 259 */                   if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
/* 371 */                       i4 = historySize;
                            } else {
/* 269 */                       long jFloatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
/* 274 */                       i4 = historySize;
/* 287 */                       long jFloatToRawIntBits6 = (jFloatToRawIntBits5 << j2) | (Float.floatToRawIntBits(historicalY) & j);
/* 289 */                       long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
/* 295 */                       float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
/* 305 */                       fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
/* 367 */                       arrayList.add(new Io1ioI0ioIO(historicalEventTime, jFloatToRawIntBits6, fValueOf != null ? fValueOf.floatValue() : 1.0f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << j2) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j) : 0L, jFloatToRawIntBits6));
                            }
/* 373 */                   i3++;
/* 375 */                   historySize = i4;
                        }
/* 422 */               long jFloatToRawIntBits7 = motionEvent.getActionMasked() != 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << j2) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j) : 0L;
/* 429 */               if (motionEvent.getClassification() == 5) {
/* 433 */                   float axisValue = motionEvent.getAxisValue(52, i);
/* 443 */                   fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
/* 447 */                   if (fValueOf != null) {
/* 449 */                       fFloatValue = fValueOf.floatValue();
                            }
                        }
/* 453 */               float f = fFloatValue;
/* 462 */               if (motionEvent.getClassification() != 3) {
/* 480 */                   j3 = jFloatToRawIntBits7;
/* 494 */                   jFloatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << j2) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j);
                        } else {
/* 499 */                   j3 = jFloatToRawIntBits7;
                        }
/* 496 */               long j6 = jFloatToRawIntBits2;
/* 509 */               boolean z4 = this.I0000Il00O.get(motionEvent.getPointerId(i), false);
/* 517 */               long eventTime = motionEvent.getEventTime();
/* 521 */               OO1il1IIii oO1il1IIii = new OO1il1IIii();
/* 524 */               oO1il1IIii.I00000oIO = jValueAt;
/* 526 */               oO1il1IIii.I00000oOI = eventTime;
/* 528 */               oO1il1IIii.I0000Il00O = jFloatToRawIntBits;
/* 530 */               oO1il1IIii.I0000O = jI00IO1;
/* 534 */               oO1il1IIii.I0000oI00 = z;
/* 536 */               oO1il1IIii.I0001Ioi1lo = pressure;
/* 538 */               oO1il1IIii.I000II = i2;
/* 540 */               oO1il1IIii.I000O01llI0 = z4;
/* 542 */               oO1il1IIii.I000OOo1O = arrayList;
/* 546 */               oO1il1IIii.I000OiO = j3;
/* 550 */               oO1il1IIii.I000iOII = f;
/* 554 */               oO1il1IIii.I000l1 = j6;
/* 558 */               oO1il1IIii.I000lI = jFloatToRawIntBits3;
/* 560 */               VarHandle.storeStoreFence();
/* 2230 */              return oO1il1IIii;
                    }
/* 211 */           r46 = z3;
/* 179 */           i2 = 0;
                    j2 = r46;
/* 220 */           ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
/* 223 */           historySize = motionEvent.getHistorySize();
/* 229 */           i3 = 0;
                    while (true) {
/* 238 */               if (i3 < historySize) {
                        }
/* 373 */               i3++;
/* 375 */               historySize = i4;
                    }
/* 422 */           if (motionEvent.getActionMasked() != 8) {
                    }
/* 429 */           if (motionEvent.getClassification() == 5) {
                    }
/* 453 */           float f2 = fFloatValue;
/* 462 */           if (motionEvent.getClassification() != 3) {
                    }
/* 496 */           long j62 = jFloatToRawIntBits2;
/* 509 */           boolean z42 = this.I0000Il00O.get(motionEvent.getPointerId(i), false);
/* 517 */           long eventTime2 = motionEvent.getEventTime();
/* 521 */           OO1il1IIii oO1il1IIii2 = new OO1il1IIii();
/* 524 */           oO1il1IIii2.I00000oIO = jValueAt;
/* 526 */           oO1il1IIii2.I00000oOI = eventTime2;
/* 528 */           oO1il1IIii2.I0000Il00O = jFloatToRawIntBits;
/* 530 */           oO1il1IIii2.I0000O = jI00IO1;
/* 534 */           oO1il1IIii2.I0000oI00 = z;
/* 536 */           oO1il1IIii2.I0001Ioi1lo = pressure;
/* 538 */           oO1il1IIii2.I000II = i2;
/* 540 */           oO1il1IIii2.I000O01llI0 = z42;
/* 542 */           oO1il1IIii2.I000OOo1O = arrayList2;
/* 546 */           oO1il1IIii2.I000OiO = j3;
/* 550 */           oO1il1IIii2.I000iOII = f2;
/* 554 */           oO1il1IIii2.I000l1 = j62;
/* 558 */           oO1il1IIii2.I000lI = jFloatToRawIntBits3;
/* 560 */           VarHandle.storeStoreFence();
/* 2230 */          return oO1il1IIii2;
                }

                public final void I0000oI00(MotionEvent motionEvent) {
/* 1 */             SparseBooleanArray sparseBooleanArray = this.I0000Il00O;
/* 3 */             SparseLongArray sparseLongArray = this.I00000oOI;
/* 5 */             int actionMasked = motionEvent.getActionMasked();
/* 11 */            if (actionMasked == 1 || actionMasked == 6) {
/* 21 */                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 29 */                if (!sparseBooleanArray.get(pointerId, false)) {
/* 31 */                    sparseLongArray.delete(pointerId);
/* 34 */                    sparseBooleanArray.delete(pointerId);
                        }
                    }
/* 45 */            if (sparseLongArray.size() > motionEvent.getPointerCount()) {
/* 53 */                for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
/* 55 */                    int iKeyAt = sparseLongArray.keyAt(size);
/* 59 */                    int pointerCount = motionEvent.getPointerCount();
/* 63 */                    int i = 0;
                            while (true) {
/* 64 */                        if (i >= pointerCount) {
/* 76 */                            sparseLongArray.removeAt(size);
/* 79 */                            sparseBooleanArray.delete(iKeyAt);
                                    break;
                                } else if (motionEvent.getPointerId(i) == iKeyAt) {
                                    break;
                                } else {
/* 73 */                            i++;
                                }
                            }
                        }
                    }
                }
            }
