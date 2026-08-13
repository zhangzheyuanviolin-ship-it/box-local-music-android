            package p000;

            import android.R;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.SpannableString;
            import android.text.TextUtils;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class I01oII0IOOO {
                public AccessibilityNodeInfo I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public static String I0000Il00O(int i) {
/* 2 */             if (i == 1) {
/* 151 */               return "ACTION_FOCUS";
                    }
/* 5 */             if (i == 2) {
/* 148 */               return "ACTION_CLEAR_FOCUS";
                    }
                    switch (i) {
                        case 4:
/* 145 */                   return "ACTION_SELECT";
                        case 8:
/* 142 */                   return "ACTION_CLEAR_SELECTION";
                        case 16:
/* 139 */                   return "ACTION_CLICK";
                        case 32:
/* 136 */                   return "ACTION_LONG_CLICK";
                        case Barcode.FORMAT_EAN_8:
/* 133 */                   return "ACTION_ACCESSIBILITY_FOCUS";
                        case Barcode.FORMAT_ITF:
/* 130 */                   return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        case Barcode.FORMAT_QR_CODE:
/* 127 */                   return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        case Barcode.FORMAT_UPC_A:
/* 124 */                   return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        case Barcode.FORMAT_UPC_E:
/* 121 */                   return "ACTION_NEXT_HTML_ELEMENT";
                        case Barcode.FORMAT_PDF417:
/* 118 */                   return "ACTION_PREVIOUS_HTML_ELEMENT";
                        case Barcode.FORMAT_AZTEC:
/* 115 */                   return "ACTION_SCROLL_FORWARD";
                        case 8192:
/* 112 */                   return "ACTION_SCROLL_BACKWARD";
                        case 16384:
/* 109 */                   return "ACTION_COPY";
                        case 32768:
/* 106 */                   return "ACTION_PASTE";
                        case 65536:
/* 103 */                   return "ACTION_CUT";
                        case 131072:
/* 100 */                   return "ACTION_SET_SELECTION";
                        case 262144:
/* 97 */                    return "ACTION_EXPAND";
                        case 524288:
/* 94 */                    return "ACTION_COLLAPSE";
                        case 2097152:
/* 91 */                    return "ACTION_SET_TEXT";
                        case R.id.accessibilityActionMoveWindow:
/* 88 */                    return "ACTION_MOVE_WINDOW";
                        default:
                            switch (i) {
                                case R.id.accessibilityActionShowOnScreen:
/* 85 */                            return "ACTION_SHOW_ON_SCREEN";
                                case R.id.accessibilityActionScrollToPosition:
/* 82 */                            return "ACTION_SCROLL_TO_POSITION";
                                case R.id.accessibilityActionScrollUp:
/* 79 */                            return "ACTION_SCROLL_UP";
                                case R.id.accessibilityActionScrollLeft:
/* 76 */                            return "ACTION_SCROLL_LEFT";
                                case R.id.accessibilityActionScrollDown:
/* 73 */                            return "ACTION_SCROLL_DOWN";
                                case R.id.accessibilityActionScrollRight:
/* 70 */                            return "ACTION_SCROLL_RIGHT";
                                case R.id.accessibilityActionContextClick:
/* 67 */                            return "ACTION_CONTEXT_CLICK";
                                case R.id.accessibilityActionSetProgress:
/* 64 */                            return "ACTION_SET_PROGRESS";
                                default:
                                    switch (i) {
                                        case R.id.accessibilityActionShowTooltip:
/* 61 */                                    return "ACTION_SHOW_TOOLTIP";
                                        case R.id.accessibilityActionHideTooltip:
/* 58 */                                    return "ACTION_HIDE_TOOLTIP";
                                        case R.id.accessibilityActionPageUp:
/* 55 */                                    return "ACTION_PAGE_UP";
                                        case R.id.accessibilityActionPageDown:
/* 52 */                                    return "ACTION_PAGE_DOWN";
                                        case R.id.accessibilityActionPageLeft:
/* 49 */                                    return "ACTION_PAGE_LEFT";
                                        case R.id.accessibilityActionPageRight:
/* 46 */                                    return "ACTION_PAGE_RIGHT";
                                        case R.id.accessibilityActionPressAndHold:
/* 43 */                                    return "ACTION_PRESS_AND_HOLD";
                                        default:
                                            switch (i) {
                                                case R.id.accessibilityActionImeEnter:
/* 40 */                                            return "ACTION_IME_ENTER";
                                                case R.id.accessibilityActionDragStart:
/* 37 */                                            return "ACTION_DRAG_START";
                                                case R.id.accessibilityActionDragDrop:
/* 34 */                                            return "ACTION_DRAG_DROP";
                                                case R.id.accessibilityActionDragCancel:
/* 31 */                                            return "ACTION_DRAG_CANCEL";
                                                default:
                                                    switch (i) {
                                                        case R.id.accessibilityActionScrollInDirection:
/* 28 */                                                    return "ACTION_SCROLL_IN_DIRECTION";
                                                        case R.id.ALT:
/* 25 */                                                    return "ACTION_SET_EXTENDED_SELECTION";
                                                        default:
/* 22 */                                                    return "ACTION_UNKNOWN";
                                                    }
                                            }
                                    }
                            }
                    }
                }

                public final void I00000oIO(I01o0l i01o0l) {
/* 7 */             this.I00000oIO.addAction((AccessibilityNodeInfo.AccessibilityAction) i01o0l.I00000oIO);
                }

                public final ArrayList I00000oOI(String str) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = this.I00000oIO;
/* 7 */             ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
/* 11 */            if (integerArrayList != null) {
/* 29 */                return integerArrayList;
                    }
/* 15 */            ArrayList<Integer> arrayList = new ArrayList<>();
/* 22 */            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
/* 29 */            return arrayList;
                }

                public final CharSequence I0000O() {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = this.I00000oIO;
/* 13 */            if (I00000oOI("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
/* 136 */               return accessibilityNodeInfo.getText();
                    }
/* 15 */            ArrayList arrayListI00000oOI = I00000oOI("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
/* 21 */            ArrayList arrayListI00000oOI2 = I00000oOI("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
/* 27 */            ArrayList arrayListI00000oOI3 = I00000oOI("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
/* 33 */            ArrayList arrayListI00000oOI4 = I00000oOI("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
/* 56 */            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
/* 63 */            for (int i = 0; i < arrayListI00000oOI.size(); i++) {
/* 73 */                int iIntValue = ((Integer) arrayListI00000oOI4.get(i)).intValue();
/* 83 */                int i2 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
/* 87 */                I01ll0oooOoO i01ll0oooOoO = new I01ll0oooOoO();
/* 90 */                i01ll0oooOoO.I00iOIl = iIntValue;
/* 92 */                i01ll0oooOoO.I00iiI = this;
/* 94 */                i01ll0oooOoO.I00iiO = i2;
/* 96 */                VarHandle.storeStoreFence();
/* 129 */               spannableString.setSpan(i01ll0oooOoO, ((Integer) arrayListI00000oOI.get(i)).intValue(), ((Integer) arrayListI00000oOI2.get(i)).intValue(), ((Integer) arrayListI00000oOI3.get(i)).intValue());
                    }
/* 135 */           return spannableString;
                }

                public final void I0000oI00(String str) {
/* 3 */             this.I00000oIO.setClassName(str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof I01oII0IOOO)) {
/* 5 */                 return false;
                    }
/* 14 */            I01oII0IOOO i01oII0IOOO = (I01oII0IOOO) obj;
/* 16 */            AccessibilityNodeInfo accessibilityNodeInfo = this.I00000oIO;
/* 18 */            AccessibilityNodeInfo accessibilityNodeInfo2 = i01oII0IOOO.I00000oIO;
/* 20 */            if (accessibilityNodeInfo == null) {
/* 22 */                if (accessibilityNodeInfo2 != null) {
/* 5 */                     return false;
                        }
                    } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
/* 5 */                 return false;
                    }
                    return this.I0000Il00O == i01oII0IOOO.I0000Il00O && this.I00000oOI == i01oII0IOOO.I00000oOI;
                }

                public final int hashCode() {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = this.I00000oIO;
/* 3 */             if (accessibilityNodeInfo == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return accessibilityNodeInfo.hashCode();
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            Rect rect = new Rect();
/* 18 */            AccessibilityNodeInfo accessibilityNodeInfo = this.I00000oIO;
/* 20 */            accessibilityNodeInfo.getBoundsInParent(rect);
/* 37 */            sb.append("; boundsInParent: " + rect);
/* 40 */            accessibilityNodeInfo.getBoundsInScreen(rect);
/* 57 */            sb.append("; boundsInScreen: " + rect);
/* 60 */            accessibilityNodeInfo.getBoundsInWindow(rect);
/* 77 */            sb.append("; boundsInWindow: " + rect);
/* 82 */            sb.append("; packageName: ");
/* 89 */            sb.append(accessibilityNodeInfo.getPackageName());
/* 94 */            sb.append("; className: ");
/* 101 */           sb.append(accessibilityNodeInfo.getClassName());
/* 106 */           sb.append("; text: ");
/* 113 */           sb.append(I0000O());
/* 118 */           sb.append("; error: ");
/* 125 */           sb.append(accessibilityNodeInfo.getError());
/* 130 */           sb.append("; maxTextLength: ");
/* 137 */           sb.append(accessibilityNodeInfo.getMaxTextLength());
/* 142 */           sb.append("; stateDescription: ");
/* 149 */           sb.append(accessibilityNodeInfo.getStateDescription());
/* 154 */           sb.append("; contentDescription: ");
/* 161 */           sb.append(accessibilityNodeInfo.getContentDescription());
/* 166 */           sb.append("; supplementalDescription: ");
/* 169 */           int i = Build.VERSION.SDK_INT;
/* 190 */           sb.append(i >= 36 ? I01o11oO.I0000Il00O(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
/* 195 */           sb.append("; tooltipText: ");
/* 202 */           sb.append(accessibilityNodeInfo.getTooltipText());
/* 207 */           sb.append("; viewIdResName: ");
/* 214 */           sb.append(accessibilityNodeInfo.getViewIdResourceName());
/* 219 */           sb.append("; uniqueId: ");
/* 226 */           sb.append(accessibilityNodeInfo.getUniqueId());
/* 231 */           sb.append("; checkable: ");
/* 238 */           sb.append(accessibilityNodeInfo.isCheckable());
/* 243 */           sb.append("; checked: ");
/* 263 */           int iI00000oIO = i >= 36 ? I01o11oO.I00000oIO(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
/* 267 */           String str = "PARTIAL";
/* 282 */           sb.append(iI00000oIO == 1 ? "TRUE" : iI00000oIO == 2 ? "PARTIAL" : "FALSE");
/* 287 */           sb.append("; fieldRequired: ");
/* 307 */           sb.append(i >= 36 ? I01o11oO.I0000O(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
/* 312 */           sb.append("; focusable: ");
/* 319 */           sb.append(accessibilityNodeInfo.isFocusable());
/* 324 */           sb.append("; focused: ");
/* 331 */           sb.append(accessibilityNodeInfo.isFocused());
/* 336 */           sb.append("; selected: ");
/* 343 */           sb.append(accessibilityNodeInfo.isSelected());
/* 348 */           sb.append("; clickable: ");
/* 355 */           sb.append(accessibilityNodeInfo.isClickable());
/* 360 */           sb.append("; longClickable: ");
/* 367 */           sb.append(accessibilityNodeInfo.isLongClickable());
/* 372 */           sb.append("; contextClickable: ");
/* 379 */           sb.append(accessibilityNodeInfo.isContextClickable());
/* 384 */           sb.append("; expandedState: ");
/* 401 */           int iI00000oOI = i >= 36 ? I01o11oO.I00000oOI(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
/* 405 */           if (iI00000oOI == 0) {
/* 423 */               str = "UNDEFINED";
                    } else if (iI00000oOI == 1) {
/* 420 */               str = "COLLAPSED";
                    } else if (iI00000oOI != 2) {
/* 417 */               str = iI00000oOI != 3 ? "UNKNOWN" : "FULL";
                    }
/* 425 */           sb.append(str);
/* 430 */           sb.append("; enabled: ");
/* 437 */           sb.append(accessibilityNodeInfo.isEnabled());
/* 442 */           sb.append("; password: ");
/* 449 */           sb.append(accessibilityNodeInfo.isPassword());
/* 470 */           sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
/* 475 */           sb.append("; containerTitle: ");
/* 482 */           sb.append(accessibilityNodeInfo.getContainerTitle());
/* 487 */           sb.append("; granularScrollingSupported: ");
/* 490 */           Bundle extras = accessibilityNodeInfo.getExtras();
/* 511 */           sb.append(extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 67108864) == 67108864);
/* 516 */           sb.append("; importantForAccessibility: ");
/* 523 */           sb.append(accessibilityNodeInfo.isImportantForAccessibility());
/* 528 */           sb.append("; visible: ");
/* 535 */           sb.append(accessibilityNodeInfo.isVisibleToUser());
/* 540 */           sb.append("; isTextSelectable: ");
/* 547 */           sb.append(accessibilityNodeInfo.isTextSelectable());
/* 552 */           sb.append("; accessibilityDataSensitive: ");
/* 559 */           sb.append(accessibilityNodeInfo.isAccessibilityDataSensitive());
/* 564 */           sb.append("; [");
/* 567 */           List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
/* 573 */           ArrayList arrayList = new ArrayList();
/* 576 */           int size = actionList.size();
/* 581 */           for (int i2 = 0; i2 < size; i2++) {
/* 596 */               arrayList.add(new I01o0l(actionList.get(i2), 0, null, null, null));
                    }
/* 606 */           for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 612 */               I01o0l i01o0l = (I01o0l) arrayList.get(i3);
/* 614 */               int iI00000oIO2 = i01o0l.I00000oIO();
/* 618 */               Object obj = i01o0l.I00000oIO;
/* 620 */               String strI0000Il00O = I0000Il00O(iI00000oIO2);
/* 630 */               if (strI0000Il00O.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
/* 647 */                   strI0000Il00O = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                        }
/* 651 */               sb.append(strI0000Il00O);
/* 659 */               if (i3 != arrayList.size() - 1) {
/* 663 */                   sb.append(", ");
                        }
                    }
/* 671 */           sb.append("]");
/* 674 */           return sb.toString();
                }
            }
