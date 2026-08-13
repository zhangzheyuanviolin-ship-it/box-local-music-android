            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            
            public class I1IlioI1o1I extends AbstractSet {
                public final int I00iOIl;
                public final Object I00iiI;

                public I1IlioI1o1I(Object obj, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                @Override
                public boolean add(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 1:
/* 215 */                   Map.Entry entry = (Map.Entry) obj;
/* 221 */                   if (contains(entry)) {
/* 3 */                         return false;
                            }
/* 235 */                   ((Ol1Ili0) obj2).put((Comparable) entry.getKey(), entry.getValue());
/* 4 */                     return true;
                        case 2:
/* 190 */                   Map.Entry entry2 = (Map.Entry) obj;
/* 196 */                   if (contains(entry2)) {
/* 3 */                         return false;
                            }
/* 210 */                   ((Ol1Io01IOiO) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
/* 4 */                     return true;
                        case 3:
/* 165 */                   Map.Entry entry3 = (Map.Entry) obj;
/* 171 */                   if (contains(entry3)) {
/* 3 */                         return false;
                            }
/* 185 */                   ((Ol1Io11i1Ol) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
/* 4 */                     return true;
                        case 4:
/* 140 */                   Map.Entry entry4 = (Map.Entry) obj;
/* 146 */                   if (contains(entry4)) {
/* 3 */                         return false;
                            }
/* 160 */                   ((i11o10OIl) obj2).put((Comparable) entry4.getKey(), entry4.getValue());
/* 4 */                     return true;
                        case 5:
/* 115 */                   Map.Entry entry5 = (Map.Entry) obj;
/* 121 */                   if (contains(entry5)) {
/* 3 */                         return false;
                            }
/* 135 */                   ((iI11OIoO) obj2).put((Comparable) entry5.getKey(), entry5.getValue());
/* 4 */                     return true;
                        case 6:
/* 90 */                    Map.Entry entry6 = (Map.Entry) obj;
/* 96 */                    if (contains(entry6)) {
/* 3 */                         return false;
                            }
/* 110 */                   ((ii0oll0il) obj2).I00000oOI((Comparable) entry6.getKey(), entry6.getValue());
/* 4 */                     return true;
                        case 7:
                        default:
/* 10 */                    return super.add(obj);
                        case 8:
/* 65 */                    Map.Entry entry7 = (Map.Entry) obj;
/* 71 */                    if (contains(entry7)) {
/* 3 */                         return false;
                            }
/* 85 */                    ((ioolilol1oO0) obj2).I00000oOI((Comparable) entry7.getKey(), entry7.getValue());
/* 4 */                     return true;
                        case 9:
/* 40 */                    Map.Entry entry8 = (Map.Entry) obj;
/* 46 */                    if (contains(entry8)) {
/* 3 */                         return false;
                            }
/* 60 */                    ((lOI1I000IoiI) obj2).I00000oOI((Comparable) entry8.getKey(), entry8.getValue());
/* 4 */                     return true;
                        case 10:
/* 15 */                    Map.Entry entry9 = (Map.Entry) obj;
/* 21 */                    if (contains(entry9)) {
/* 3 */                         return false;
                            }
/* 35 */                    ((o0OIiOo0oOi) obj2).I00000oOI((Comparable) entry9.getKey(), entry9.getValue());
/* 4 */                     return true;
                    }
                }

                @Override
                public void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 1:
/* 62 */                    ((Ol1Ili0) obj).clear();
                            break;
                        case 2:
/* 56 */                    ((Ol1Io01IOiO) obj).clear();
                            break;
                        case 3:
/* 50 */                    ((Ol1Io11i1Ol) obj).clear();
                            break;
                        case 4:
/* 44 */                    ((i11o10OIl) obj).clear();
                            break;
                        case 5:
/* 38 */                    ((iI11OIoO) obj).clear();
                            break;
                        case 6:
/* 32 */                    ((ii0oll0il) obj).clear();
                            break;
                        case 7:
                        default:
/* 8 */                     super.clear();
                            break;
                        case 8:
/* 26 */                    ((ioolilol1oO0) obj).clear();
                            break;
                        case 9:
/* 20 */                    ((lOI1I000IoiI) obj).clear();
                            break;
                        case 10:
/* 14 */                    ((o0OIiOo0oOi) obj).clear();
                            break;
                    }
                }

                @Override
                public boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 1:
/* 247 */                   Map.Entry entry = (Map.Entry) obj;
/* 255 */                   Object obj3 = ((Ol1Ili0) obj2).get(entry.getKey());
/* 259 */                   Object value = entry.getValue();
/* 263 */                   if (obj3 != value) {
                                return obj3 != null && obj3.equals(value);
                            }
/* 5 */                     return true;
                        case 2:
/* 218 */                   Map.Entry entry2 = (Map.Entry) obj;
/* 226 */                   Object obj4 = ((Ol1Io01IOiO) obj2).get(entry2.getKey());
/* 230 */                   Object value2 = entry2.getValue();
/* 234 */                   if (obj4 != value2) {
                                return obj4 != null && obj4.equals(value2);
                            }
/* 5 */                     return true;
                        case 3:
/* 189 */                   Map.Entry entry3 = (Map.Entry) obj;
/* 197 */                   Object obj5 = ((Ol1Io11i1Ol) obj2).get(entry3.getKey());
/* 201 */                   Object value3 = entry3.getValue();
/* 205 */                   if (obj5 != value3) {
                                return obj5 != null && obj5.equals(value3);
                            }
/* 5 */                     return true;
                        case 4:
/* 160 */                   Map.Entry entry4 = (Map.Entry) obj;
/* 168 */                   Object obj6 = ((i11o10OIl) obj2).get(entry4.getKey());
/* 172 */                   Object value4 = entry4.getValue();
/* 176 */                   if (obj6 != value4) {
                                return obj6 != null && obj6.equals(value4);
                            }
/* 5 */                     return true;
                        case 5:
/* 131 */                   Map.Entry entry5 = (Map.Entry) obj;
/* 139 */                   Object obj7 = ((iI11OIoO) obj2).get(entry5.getKey());
/* 143 */                   Object value5 = entry5.getValue();
/* 147 */                   if (obj7 != value5) {
                                return obj7 != null && obj7.equals(value5);
                            }
/* 5 */                     return true;
                        case 6:
/* 102 */                   Map.Entry entry6 = (Map.Entry) obj;
/* 110 */                   Object obj8 = ((ii0oll0il) obj2).get(entry6.getKey());
/* 114 */                   Object value6 = entry6.getValue();
/* 118 */                   if (obj8 != value6) {
                                return obj8 != null && obj8.equals(value6);
                            }
/* 5 */                     return true;
                        case 7:
                        default:
/* 10 */                    return super.contains(obj);
                        case 8:
/* 73 */                    Map.Entry entry7 = (Map.Entry) obj;
/* 81 */                    Object obj9 = ((ioolilol1oO0) obj2).get(entry7.getKey());
/* 85 */                    Object value7 = entry7.getValue();
/* 89 */                    if (obj9 != value7) {
                                return obj9 != null && obj9.equals(value7);
                            }
/* 5 */                     return true;
                        case 9:
/* 44 */                    Map.Entry entry8 = (Map.Entry) obj;
/* 52 */                    Object obj10 = ((lOI1I000IoiI) obj2).get(entry8.getKey());
/* 56 */                    Object value8 = entry8.getValue();
/* 60 */                    if (obj10 != value8) {
                                return obj10 != null && obj10.equals(value8);
                            }
/* 5 */                     return true;
                        case 10:
/* 15 */                    Map.Entry entry9 = (Map.Entry) obj;
/* 23 */                    Object obj11 = ((o0OIiOo0oOi) obj2).get(entry9.getKey());
/* 27 */                    Object value9 = entry9.getValue();
/* 31 */                    if (obj11 != value9) {
                                return obj11 != null && obj11.equals(value9);
                            }
/* 5 */                     return true;
                    }
                }

                @Override
                public Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 1;
/* 4 */             int i3 = 2;
/* 5 */             int i4 = 4;
/* 6 */             int i5 = 0;
/* 8 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 182 */                   I1Io0i0II i1Io0i0II = (I1Io0i0II) obj;
/* 184 */                   I1IloI0 i1IloI0 = new I1IloI0();
/* 187 */                   i1IloI0.I00iio = i1Io0i0II;
/* 192 */                   i1IloI0.I00iOIl = i1Io0i0II.I00iiO - 1;
/* 194 */                   i1IloI0.I00iiI = -1;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   return i1IloI0;
                        case 1:
/* 169 */                   Ol1O0IIl1I ol1O0IIl1I = new Ol1O0IIl1I(i5);
/* 172 */                   ol1O0IIl1I.I00ilI0I1 = (Ol1Ili0) obj;
/* 174 */                   ol1O0IIl1I.I00iiI = -1;
/* 176 */                   VarHandle.storeStoreFence();
/* 179 */                   return ol1O0IIl1I;
                        case 2:
/* 154 */                   Ol1O0IIl1I ol1O0IIl1I2 = new Ol1O0IIl1I(i2);
/* 157 */                   ol1O0IIl1I2.I00ilI0I1 = (Ol1Io01IOiO) obj;
/* 159 */                   ol1O0IIl1I2.I00iiI = -1;
/* 161 */                   VarHandle.storeStoreFence();
/* 164 */                   return ol1O0IIl1I2;
                        case 3:
/* 139 */                   Ol1O0IIl1I ol1O0IIl1I3 = new Ol1O0IIl1I(i3);
/* 142 */                   ol1O0IIl1I3.I00ilI0I1 = (Ol1Io11i1Ol) obj;
/* 144 */                   ol1O0IIl1I3.I00iiI = -1;
/* 146 */                   VarHandle.storeStoreFence();
/* 149 */                   return ol1O0IIl1I3;
                        case 4:
/* 124 */                   Ol1O0IIl1I ol1O0IIl1I4 = new Ol1O0IIl1I(3);
/* 127 */                   ol1O0IIl1I4.I00ilI0I1 = (i11o10OIl) obj;
/* 129 */                   ol1O0IIl1I4.I00iiI = -1;
/* 131 */                   VarHandle.storeStoreFence();
/* 134 */                   return ol1O0IIl1I4;
                        case 5:
/* 108 */                   Ol1O0IIl1I ol1O0IIl1I5 = new Ol1O0IIl1I(i4);
/* 111 */                   ol1O0IIl1I5.I00ilI0I1 = (iI11OIoO) obj;
/* 113 */                   ol1O0IIl1I5.I00iiI = -1;
/* 115 */                   VarHandle.storeStoreFence();
/* 118 */                   return ol1O0IIl1I5;
                        case 6:
/* 93 */                    Ol1O0IIl1I ol1O0IIl1I6 = new Ol1O0IIl1I(5);
/* 96 */                    ol1O0IIl1I6.I00ilI0I1 = (ii0oll0il) obj;
/* 98 */                    ol1O0IIl1I6.I00iiI = -1;
/* 100 */                   VarHandle.storeStoreFence();
/* 103 */                   return ol1O0IIl1I6;
                        case 7:
/* 77 */                    I1IoOOl1l1oo i1IoOOl1l1oo = new I1IoOOl1l1oo(i3);
/* 80 */                    i1IoOOl1l1oo.I00iiO = this;
/* 82 */                    i1IoOOl1l1oo.I00iiI = 0;
/* 84 */                    VarHandle.storeStoreFence();
/* 87 */                    return i1IoOOl1l1oo;
                        case 8:
/* 64 */                    Ol1O0IIl1I ol1O0IIl1I7 = new Ol1O0IIl1I(6);
/* 67 */                    ol1O0IIl1I7.I00ilI0I1 = (ioolilol1oO0) obj;
/* 69 */                    ol1O0IIl1I7.I00iiI = -1;
/* 71 */                    VarHandle.storeStoreFence();
/* 74 */                    return ol1O0IIl1I7;
                        case 9:
/* 48 */                    Ol1O0IIl1I ol1O0IIl1I8 = new Ol1O0IIl1I(7);
/* 51 */                    ol1O0IIl1I8.I00ilI0I1 = (lOI1I000IoiI) obj;
/* 53 */                    ol1O0IIl1I8.I00iiI = -1;
/* 55 */                    VarHandle.storeStoreFence();
/* 58 */                    return ol1O0IIl1I8;
                        case 10:
/* 32 */                    Ol1O0IIl1I ol1O0IIl1I9 = new Ol1O0IIl1I(8);
/* 35 */                    ol1O0IIl1I9.I00ilI0I1 = (o0OIiOo0oOi) obj;
/* 37 */                    ol1O0IIl1I9.I00iiI = -1;
/* 39 */                    VarHandle.storeStoreFence();
/* 42 */                    return ol1O0IIl1I9;
                        default:
/* 15 */                    I1IoOOl1l1oo i1IoOOl1l1oo2 = new I1IoOOl1l1oo(i4);
/* 18 */                    i1IoOOl1l1oo2.I00iiO = this;
/* 20 */                    i1IoOOl1l1oo2.I00iiI = 0;
/* 22 */                    VarHandle.storeStoreFence();
/* 25 */                    return i1IoOOl1l1oo2;
                    }
                }

                @Override
                public boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 1:
/* 167 */                   Map.Entry entry = (Map.Entry) obj;
/* 173 */                   if (!contains(entry)) {
/* 3 */                         return false;
                            }
/* 181 */                   ((Ol1Ili0) obj2).remove(entry.getKey());
/* 4 */                     return true;
                        case 2:
/* 148 */                   Map.Entry entry2 = (Map.Entry) obj;
/* 154 */                   if (!contains(entry2)) {
/* 3 */                         return false;
                            }
/* 162 */                   ((Ol1Io01IOiO) obj2).remove(entry2.getKey());
/* 4 */                     return true;
                        case 3:
/* 129 */                   Map.Entry entry3 = (Map.Entry) obj;
/* 135 */                   if (!contains(entry3)) {
/* 3 */                         return false;
                            }
/* 143 */                   ((Ol1Io11i1Ol) obj2).remove(entry3.getKey());
/* 4 */                     return true;
                        case 4:
/* 110 */                   Map.Entry entry4 = (Map.Entry) obj;
/* 116 */                   if (!contains(entry4)) {
/* 3 */                         return false;
                            }
/* 124 */                   ((i11o10OIl) obj2).remove(entry4.getKey());
/* 4 */                     return true;
                        case 5:
/* 91 */                    Map.Entry entry5 = (Map.Entry) obj;
/* 97 */                    if (!contains(entry5)) {
/* 3 */                         return false;
                            }
/* 105 */                   ((iI11OIoO) obj2).remove(entry5.getKey());
/* 4 */                     return true;
                        case 6:
/* 72 */                    Map.Entry entry6 = (Map.Entry) obj;
/* 78 */                    if (!contains(entry6)) {
/* 3 */                         return false;
                            }
/* 86 */                    ((ii0oll0il) obj2).remove(entry6.getKey());
/* 4 */                     return true;
                        case 7:
                        default:
/* 10 */                    return super.remove(obj);
                        case 8:
/* 53 */                    Map.Entry entry7 = (Map.Entry) obj;
/* 59 */                    if (!contains(entry7)) {
/* 3 */                         return false;
                            }
/* 67 */                    ((ioolilol1oO0) obj2).remove(entry7.getKey());
/* 4 */                     return true;
                        case 9:
/* 34 */                    Map.Entry entry8 = (Map.Entry) obj;
/* 40 */                    if (!contains(entry8)) {
/* 3 */                         return false;
                            }
/* 48 */                    ((lOI1I000IoiI) obj2).remove(entry8.getKey());
/* 4 */                     return true;
                        case 10:
/* 15 */                    Map.Entry entry9 = (Map.Entry) obj;
/* 21 */                    if (!contains(entry9)) {
/* 3 */                         return false;
                            }
/* 29 */                    ((o0OIiOo0oOi) obj2).remove(entry9.getKey());
/* 4 */                     return true;
                    }
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 83 */                    return ((I1Io0i0II) obj).I00iiO;
                        case 1:
/* 76 */                    return ((Ol1Ili0) obj).size();
                        case 2:
/* 69 */                    return ((Ol1Io01IOiO) obj).size();
                        case 3:
/* 62 */                    return ((Ol1Io11i1Ol) obj).size();
                        case 4:
/* 55 */                    return ((i11o10OIl) obj).size();
                        case 5:
/* 48 */                    return ((iI11OIoO) obj).size();
                        case 6:
/* 41 */                    return ((ii0oll0il) obj).size();
                        case 7:
/* 36 */                    return ((iil1lo) obj).I0000oI00;
                        case 8:
/* 29 */                    return ((ioolilol1oO0) obj).size();
                        case 9:
/* 22 */                    return ((lOI1I000IoiI) obj).size();
                        case 10:
/* 15 */                    return ((o0OIiOo0oOi) obj).size();
                        default:
/* 10 */                    return ((o1I0O0l1o0l) obj).I0000oI00;
                    }
                }
            }
