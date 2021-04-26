  
  
    // var rIndex,
        // table = document.getElementById("table");
    
    // check the empty input
    // function checkEmptyInput(){
      // var isEmpty = false,
          // fname = document.getElementById("fname").value,
          // lname = document.getElementById("lname").value,
          // age = document.getElementById("age").value;
          
          // if(fname === ""){
            // alert("First Name Cannot Be Empty");
            // isEmpty = true;
          // }
          
          // if(lname === ""){
            // alert("Last Name Cannot Be Empty");
            // isEmpty = true;
          // }
          
          // if(age === ""){
            // alert("Age Cannot Be Empty");
            // isEmpty = true;
          // }
          // return isEmpty;
    // }
  
    // add Row
    // function addHTMLTableRow(){
      // get the table by id
      // create a new row and cells
      // get value from input text
      // set the values into row cell's
      // if(!checkEmptyInput()){
        // var newRow = table.insertRow(table.length),
        // cell1 = newRow.insertCell(0),
        // cell2 = newRow.insertCell(1),
        // cell3 = newRow.insertCell(2),
        // fname = document.getElementById("fname").value,
        // lname = document.getElementById("lname").value,
        // age = document.getElementById("age").value;
        
        // cell1.innerHTML = fname;
        // cell2.innerHTML = lname;
        // cell3.innerHTML = age;
        
        // call the function to set the event to the new row
        // selectRowToInput();
      // }
    // }
    
    // display selected row data into input text
    // function selectRowToInput(){
      // for(var i = 0; i < table.rows.length; i++){
        // table.rows[i].onclick = function(){
          // get the selected row index
          // rIndex = this.rowIndex;
          // document.getElementById("fname").value = this.cells[0].innerHTML;
          // document.getElementById("lname").value = this.cells[1].innerHTML;
          // document.getElementById("age").value = this.cells[2].innerHTML;
        // }
      // }
    // }
    
    // selectRowToInput();
    
    // function editHtmlTableSelecctedRow(){
      // if(rIndex != 0){
        // var fname = document.getElementById("fname").value,
            // lname = document.getElementById("lname").value,
            // age = document.getElementById("age").value;
            
        // if(!checkEmptyInput()){
          // table.rows[rIndex].cells[0].innerHTML = fname;
          // table.rows[rIndex].cells[1].innerHTML = lname;
          // table.rows[rIndex].cells[2].innerHTML = age;
        // }
      // }
    // }
    
    // function removeSelectedRow(){
      // if(rIndex != 0){
        // table.deleteRow(rIndex);
      // }
      // clear input text
      // document.getElementById("fname").value = "";
      // document.getElementById("lname").value = "";
      // document.getElementById("age").value = "";
    // }
    
    //===========================================================================================================
    function wait() {
        return new Promise(resolve => setTimeout(resolve, 1000));
    }
    
    function executeAsynchronously(functions, timeout) {
      for(var i = 0; i < functions.length; i++) {
        setTimeout(functions[i], timeout);
      }
    }
    
    function getDefaultVehicle_Population_Table(){
      var fileName="Vehicle_Population_Default.txt", xmlHttp=new XMLHttpRequest();
      xmlHttp.onreadystatechange=function(){
        var tmpDoc, re=/^(.+)$/gm, arr=[], oP;
        if(xmlHttp.readyState===4){
          if(xmlHttp.status===200){
            tmpDoc=xmlHttp.responseText;
            re.lastIndex = 0;
            arr=re.exec(tmpDoc);
            counter = 0;
            while(arr!==null){
              //console.log(counter);
              //console.log(arr[1]);
              const words = arr[1].split('\t');
              //console.log(words[0]);
              if(counter == 0){
                //document.getElementById("table0caption").appendChild(document.createTextNode(words[0]));
              }
              else{
                  var newRow = Vehicle_Population_Table.insertRow(Vehicle_Population_Table.length),
                  cell1 = newRow.insertCell(0),
                  cell2 = newRow.insertCell(1),
                  cell3 = newRow.insertCell(2),
                  cell4 = newRow.insertCell(3),
                  cell5 = newRow.insertCell(4),
                  cell6 = newRow.insertCell(5),
                  cell7 = newRow.insertCell(6),
                  cell8 = newRow.insertCell(7),
                  cell9 = newRow.insertCell(8),
                  cell10 = newRow.insertCell(9);
                  
                  cell1.innerHTML = words[0];
                  cell2.innerHTML = words[1];
                  cell3.innerHTML = words[2];
                  cell4.innerHTML = words[3];
                  cell5.innerHTML = words[4];
                  cell6.innerHTML = words[5];
                  cell7.innerHTML = words[6];
                  cell8.innerHTML = words[7];
                  cell9.innerHTML = words[8];
                  cell10.innerHTML = words[9];
                  selectRowToInputVehicle_Population_Table();
              }
              //oP=document.createElement("P");
              //document.getElementById("news").appendChild(oP).appendChild(document.createTextNode(arr[1]));
              //document.getElementById("news").appendChild(document.createTextNode("\r\n"));
              arr=re.exec(tmpDoc);
              ++counter;
            }
            xmlHttp=null;
          }
        }
      };
      xmlHttp.open("POST", fileName, true); //Use POST to prevent use of cached file
      xmlHttp.send();
    }
    
    function restoreDefaultVehicle_Population_Table(){
      executeAsynchronously([clear_Vehicle_Population_Table, getDefaultVehicle_Population_Table], 1);
    }
    
    function clear_Vehicle_Population_Table(){
      //document.getElementById("table0caption").value = "";
      for(var i = Vehicle_Population_Table.rows.length - 1; i >= 0; --i){
        Vehicle_Population_Table.deleteRow(i);
      }
      document.getElementById("Time_Vehicle_Population_Table").value = "";
          document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value = "";
          document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value = "";
          document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Total_Vehicle_Population_Table").value = "";
          document.getElementById("LDV_Vehicle_Population_Table").value = "";
          document.getElementById("LDT_LDV_Vehicle_Population_Table").value = "";
    }
    
    //=====================================================================================================================
    var Vehicle_Population_rIndex,
        Vehicle_Population_Table = document.getElementById("Vehicle_Population_Table");
        
    // check the empty input
    function checkVehicle_Population_TableEmptyInput(){
      var isEmpty = false,
          Time_Vehicle_Population_Table = document.getElementById("Time_Vehicle_Population_Table").value,
          Passenger_Vehicle_Vehicle_Population_Table = document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value,
          Taxi_Vehicle_Vehicle_Population_Table = document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value,
          Light_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
          Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table = document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value,
          Large_Duty_Bus_Road_Bus_Vehicle_Population_Table = document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value,
          Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
          Total_Vehicle_Population_Table = document.getElementById("Total_Vehicle_Population_Table").value,
          LDV_Vehicle_Population_Table = document.getElementById("LDV_Vehicle_Population_Table").value,
          LDT_LDV_Vehicle_Population_Table = document.getElementById("LDT_LDV_Vehicle_Population_Table").value;
          
          if(Time_Vehicle_Population_Table === ""){
            alert("Time_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Passenger_Vehicle_Vehicle_Population_Table === ""){
            alert("Passenger_Vehicle_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Taxi_Vehicle_Vehicle_Population_Table === ""){
            alert("Taxi_Vehicle_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(Light_Duty_Commercial_Vehicle_Vehicle_Population_Table === ""){
            alert("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table === ""){
            alert("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Large_Duty_Bus_Road_Bus_Vehicle_Population_Table === ""){
            alert("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table");
            isEmpty = true;
          }
          if(Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table === ""){
            alert("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Total_Vehicle_Population_Table === ""){
            alert("Total_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(LDV_Vehicle_Population_Table === ""){
            alert("LDV_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(LDT_LDV_Vehicle_Population_Table === ""){
            alert("LDT_LDV_Vehicle_Population_Table Cannot Be Empty");
            isEmpty = true;
          }
          return isEmpty;
    }
  
    // add Row
    function addHTMLVehicle_Population_TableRow(){
      // get the table by id
      // create a new row and cells
      // get value from input text
      // set the values into row cell's
      if(!checkVehicle_Population_TableEmptyInput()){
        var newRow = Vehicle_Population_Table.insertRow(table.length),
        cell1 = newRow.insertCell(0),
        cell2 = newRow.insertCell(1),
        cell3 = newRow.insertCell(2),
        cell4 = newRow.insertCell(3),
        cell5 = newRow.insertCell(4),
        cell6 = newRow.insertCell(5),
        cell7 = newRow.insertCell(6),
        cell8 = newRow.insertCell(7),
        cell9 = newRow.insertCell(8),
        cell10 = newRow.insertCell(9),
        Time_Vehicle_Population_Table = document.getElementById("Time_Vehicle_Population_Table").value,
        Passenger_Vehicle_Vehicle_Population_Table = document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value,
        Taxi_Vehicle_Vehicle_Population_Table = document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value,
        Light_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
        Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table = document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value,
        Large_Duty_Bus_Road_Bus_Vehicle_Population_Table = document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value,
        Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
        Total_Vehicle_Population_Table = document.getElementById("Total_Vehicle_Population_Table").value,
        LDV_Vehicle_Population_Table = document.getElementById("LDV_Vehicle_Population_Table").value,
        LDT_LDV_Vehicle_Population_Table = document.getElementById("LDT_LDV_Vehicle_Population_Table").value;
        
        cell1.innerHTML = Time_Vehicle_Population_Table;
        cell2.innerHTML = Passenger_Vehicle_Vehicle_Population_Table;
        cell3.innerHTML = Taxi_Vehicle_Vehicle_Population_Table;
        cell4.innerHTML = Light_Duty_Commercial_Vehicle_Vehicle_Population_Table;
        cell5.innerHTML = Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table;
        cell6.innerHTML = Large_Duty_Bus_Road_Bus_Vehicle_Population_Table;
        cell7.innerHTML = Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table;
        cell8.innerHTML = Total_Vehicle_Population_Table;
        cell9.innerHTML = LDV_Vehicle_Population_Table;
        cell10.innerHTML = LDT_LDV_Vehicle_Population_Table;
        
        // call the function to set the event to the new row
        selectRowToInputVehicle_Population_Table();
      }
    }
    
    // display selected row data into input text
    function selectRowToInputVehicle_Population_Table(){
      //console.log("running select from vehicle population");
      for(var i = 0; i < Vehicle_Population_Table.rows.length; i++){
        Vehicle_Population_Table.rows[i].onclick = function(){
          // get the selected row index
          Vehicle_Population_rIndex = this.rowIndex;
          //console.log(Vehicle_Population_rIndex);
          document.getElementById("Time_Vehicle_Population_Table").value = this.cells[0].innerHTML;
          document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value = this.cells[1].innerHTML;
          document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value = this.cells[2].innerHTML;
          document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = this.cells[3].innerHTML;
          document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value = this.cells[4].innerHTML;
          document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value = this.cells[5].innerHTML;
          document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = this.cells[6].innerHTML;
          document.getElementById("Total_Vehicle_Population_Table").value = this.cells[7].innerHTML;
          document.getElementById("LDV_Vehicle_Population_Table").value = this.cells[8].innerHTML;
          document.getElementById("LDT_LDV_Vehicle_Population_Table").value = this.cells[9].innerHTML;
        }
      }
    }
    
    selectRowToInputVehicle_Population_Table();
    
    function editHtmlVehicle_Population_TableSelecctedRow(){
      if(Vehicle_Population_rIndex != 0){
        var Time_Vehicle_Population_Table = document.getElementById("Time_Vehicle_Population_Table").value,
            Passenger_Vehicle_Vehicle_Population_Table = document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value,
            Taxi_Vehicle_Vehicle_Population_Table = document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value,
            Light_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
            Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table = document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value,
            Large_Duty_Bus_Road_Bus_Vehicle_Population_Table = document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value,
            Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table = document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value,
            Total_Vehicle_Population_Table = document.getElementById("Total_Vehicle_Population_Table").value,
            LDV_Vehicle_Population_Table = document.getElementById("LDV_Vehicle_Population_Table").value,
            LDT_LDV_Vehicle_Population_Table = document.getElementById("LDT_LDV_Vehicle_Population_Table").value;
            
        if(!checkVehicle_Population_TableEmptyInput()){
          console.log(Vehicle_Population_Table);
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[0].innerHTML = Time_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[1].innerHTML = Passenger_Vehicle_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[2].innerHTML = Taxi_Vehicle_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[3].innerHTML = Light_Duty_Commercial_Vehicle_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[4].innerHTML = Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[5].innerHTML = Large_Duty_Bus_Road_Bus_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[6].innerHTML = Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[7].innerHTML = Total_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[8].innerHTML = LDV_Vehicle_Population_Table;
          Vehicle_Population_Table.rows[Vehicle_Population_rIndex].cells[9].innerHTML = LDT_LDV_Vehicle_Population_Table;
        }
      }
    }
    
    function removeSelectedRowVehicle_Population_Table(){
      if(Vehicle_Population_rIndex != 0){
        Vehicle_Population_Table.deleteRow(Vehicle_Population_rIndex);
      }
      // clear input text
          document.getElementById("Time_Vehicle_Population_Table").value = "";
          document.getElementById("Passenger_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Taxi_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Light_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Medium_Duty_Bus_Urban_Bus_Vehicle_Population_Table").value = "";
          document.getElementById("Large_Duty_Bus_Road_Bus_Vehicle_Population_Table").value = "";
          document.getElementById("Heavy_Duty_Commercial_Vehicle_Vehicle_Population_Table").value = "";
          document.getElementById("Total_Vehicle_Population_Table").value = "";
          document.getElementById("LDV_Vehicle_Population_Table").value = "";
          document.getElementById("LDT_LDV_Vehicle_Population_Table").value = "";
    }
    
    //==========================================================================================================================
    function getDefaultMileage_Table(){
      var fileName="Mileage_Default.txt", xmlHttp=new XMLHttpRequest();
      xmlHttp.onreadystatechange=function(){
        var tmpDoc, re=/^(.+)$/gm, arr=[], oP;
        if(xmlHttp.readyState===4){
          if(xmlHttp.status===200){
            tmpDoc=xmlHttp.responseText;
            re.lastIndex = 0;
            arr=re.exec(tmpDoc);
            counter = 0;
            while(arr!==null){
              //console.log(counter);
              //console.log(arr[1]);
              const words = arr[1].split('\t');
              //console.log(words[0]);
              if(counter == 0){
                //document.getElementById("table0caption").appendChild(document.createTextNode(words[0]));
              }
              else{
                  var newRow = Mileage_Table.insertRow(Mileage_Table.length),
                  cell1 = newRow.insertCell(0),
                  cell2 = newRow.insertCell(1),
                  cell3 = newRow.insertCell(2),
                  cell4 = newRow.insertCell(3),
                  cell5 = newRow.insertCell(4),
                  cell6 = newRow.insertCell(5),
                  cell7 = newRow.insertCell(6);
                  
                  cell1.innerHTML = words[0];
                  cell2.innerHTML = words[1];
                  cell3.innerHTML = words[2];
                  cell4.innerHTML = words[3];
                  cell5.innerHTML = words[4];
                  cell6.innerHTML = words[5];
                  cell7.innerHTML = words[6];
                  selectRowToInputMileage_Table();
              }
              //oP=document.createElement("P");
              //document.getElementById("news").appendChild(oP).appendChild(document.createTextNode(arr[1]));
              //document.getElementById("news").appendChild(document.createTextNode("\r\n"));
              arr=re.exec(tmpDoc);
              ++counter;
            }
            xmlHttp=null;
          }
        }
      };
      xmlHttp.open("POST", fileName, true); //Use POST to prevent use of cached file
      xmlHttp.send();
    }
    
    function restoreDefaultMileage_Table(){
      executeAsynchronously([clear_Mileage_Table, getDefaultMileage_Table], 1);
    }
    
    function clear_Mileage_Table(){
      //document.getElementById("table0caption").value = "";
      for(var i = Mileage_Table.rows.length - 1; i >= 0; --i){
        Mileage_Table.deleteRow(i);
      }
      document.getElementById("Time_Mileage_Table").value = "";
      document.getElementById("PV_Mileage_Table").value = "";
      document.getElementById("Taxi_Mileage_Table").value = "";
      document.getElementById("LDT_Mileage_Table").value = "";
      document.getElementById("Urban_Bus_Mileage_Table").value = "";
      document.getElementById("Road_Bus_Mileage_Table").value = "";
      document.getElementById("HDV_Truck_Mileage_Table").value = "";
    }
    //=================================================================================================================================
    var Mileage_Table_rIndex,
        Mileage_Table = document.getElementById("Mileage_Table");
        
    // check the empty input
    function checkMileage_TableEmptyInput(){
      var isEmpty = false,
          Time_Mileage_Table = document.getElementById("Time_Mileage_Table").value,
          PV_Mileage_Table = document.getElementById("PV_Mileage_Table").value,
          Taxi_Mileage_Table = document.getElementById("Taxi_Mileage_Table").value,
          LDT_Mileage_Table = document.getElementById("LDT_Mileage_Table").value,
          Urban_Bus_Mileage_Table = document.getElementById("Urban_Bus_Mileage_Table").value,
          Road_Bus_Mileage_Table = document.getElementById("Road_Bus_Mileage_Table").value,
          HDV_Truck_Mileage_Table = document.getElementById("HDV_Truck_Mileage_Table").value;
          
          if(Time_Mileage_Table === ""){
            alert("Time_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(PV_Mileage_Table === ""){
            alert("PV_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Taxi_Mileage_Table === ""){
            alert("Taxi_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(LDT_Mileage_Table === ""){
            alert("LDT_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Urban_Bus_Mileage_Table === ""){
            alert("Urban_Bus_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Road_Bus_Mileage_Table === ""){
            alert("Road_Bus_Mileage_Table");
            isEmpty = true;
          }
          if(HDV_Truck_Mileage_Table === ""){
            alert("HDV_Truck_Mileage_Table Cannot Be Empty");
            isEmpty = true;
          }
          return isEmpty;
    }
  
    // add Row
    function addHTMLMileage_TableRow(){
      // get the table by id
      // create a new row and cells
      // get value from input text
      // set the values into row cell's
      if(!checkMileage_TableEmptyInput()){
        var newRow = Mileage_Table.insertRow(table.length),
        cell1 = newRow.insertCell(0),
        cell2 = newRow.insertCell(1),
        cell3 = newRow.insertCell(2),
        cell4 = newRow.insertCell(3),
        cell5 = newRow.insertCell(4),
        cell6 = newRow.insertCell(5),
        cell7 = newRow.insertCell(6),
        Time_Mileage_Table = document.getElementById("Time_Mileage_Table").value,
        PV_Mileage_Table = document.getElementById("PV_Mileage_Table").value,
        Taxi_Mileage_Table = document.getElementById("Taxi_Mileage_Table").value,
        LDT_Mileage_Table = document.getElementById("LDT_Mileage_Table").value,
        Urban_Bus_Mileage_Table = document.getElementById("Urban_Bus_Mileage_Table").value,
        Road_Bus_Mileage_Table = document.getElementById("Road_Bus_Mileage_Table").value,
        HDV_Truck_Mileage_Table = document.getElementById("HDV_Truck_Mileage_Table").value;
        
        cell1.innerHTML = Time_Mileage_Table;
        cell2.innerHTML = PV_Mileage_Table;
        cell3.innerHTML = Taxi_Mileage_Table;
        cell4.innerHTML = LDT_Mileage_Table;
        cell5.innerHTML = Urban_Bus_Mileage_Table;
        cell6.innerHTML = Road_Bus_Mileage_Table;
        cell7.innerHTML = HDV_Truck_Mileage_Table;
        
        // call the function to set the event to the new row
        selectRowToInputMileage_Table();
      }
    }
    
    // display selected row data into input text
    function selectRowToInputMileage_Table(){
      //console.log("running select from vehicle population");
      for(var i = 0; i < Mileage_Table.rows.length; i++){
        Mileage_Table.rows[i].onclick = function(){
          // get the selected row index
          Mileage_Table_rIndex = this.rowIndex;
          //console.log(Mileage_Table_rIndex);
          document.getElementById("Time_Mileage_Table").value = this.cells[0].innerHTML;
          document.getElementById("PV_Mileage_Table").value = this.cells[1].innerHTML;
          document.getElementById("Taxi_Mileage_Table").value = this.cells[2].innerHTML;
          document.getElementById("LDT_Mileage_Table").value = this.cells[3].innerHTML;
          document.getElementById("Urban_Bus_Mileage_Table").value = this.cells[4].innerHTML;
          document.getElementById("Road_Bus_Mileage_Table").value = this.cells[5].innerHTML;
          document.getElementById("HDV_Truck_Mileage_Table").value = this.cells[6].innerHTML;
        }
      }
    }
    
    selectRowToInputMileage_Table();
    
    function editHtmlMileage_TableSelecctedRow(){
      if(Mileage_Table_rIndex != 0){
        var Time_Mileage_Table = document.getElementById("Time_Mileage_Table").value,
            PV_Mileage_Table = document.getElementById("PV_Mileage_Table").value,
            Taxi_Mileage_Table = document.getElementById("Taxi_Mileage_Table").value,
            LDT_Mileage_Table = document.getElementById("LDT_Mileage_Table").value,
            Urban_Bus_Mileage_Table = document.getElementById("Urban_Bus_Mileage_Table").value,
            Road_Bus_Mileage_Table = document.getElementById("Road_Bus_Mileage_Table").value,
            HDV_Truck_Mileage_Table = document.getElementById("HDV_Truck_Mileage_Table").value;
            
        if(!checkMileage_TableEmptyInput()){
          //console.log(Mileage_Table);
          Mileage_Table.rows[Mileage_Table_rIndex].cells[0].innerHTML = Time_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[1].innerHTML = PV_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[2].innerHTML = Taxi_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[3].innerHTML = LDT_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[4].innerHTML = Urban_Bus_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[5].innerHTML = Road_Bus_Mileage_Table;
          Mileage_Table.rows[Mileage_Table_rIndex].cells[6].innerHTML = HDV_Truck_Mileage_Table;
        }
      }
    }
    
    function removeSelectedRowMileage_Table(){
      if(Mileage_Table_rIndex != 0){
        Mileage_Table.deleteRow(Mileage_Table_rIndex);
      }
      // clear input text
          document.getElementById("Time_Mileage_Table").value = "";
          document.getElementById("PV_Mileage_Table").value = "";
          document.getElementById("Taxi_Mileage_Table").value = "";
          document.getElementById("LDT_Mileage_Table").value = "";
          document.getElementById("Urban_Bus_Mileage_Table").value = "";
          document.getElementById("Road_Bus_Mileage_Table").value = "";
          document.getElementById("HDV_Truck_Mileage_Table").value = "";
    }
    //==========================================================================================================================
    function getDefaultFE_Numbers_Table(){
      var fileName="FE_Numbers_Default.txt", xmlHttp=new XMLHttpRequest();
      xmlHttp.onreadystatechange=function(){
        var tmpDoc, re=/^(.+)$/gm, arr=[], oP;
        if(xmlHttp.readyState===4){
          if(xmlHttp.status===200){
            tmpDoc=xmlHttp.responseText;
            re.lastIndex = 0;
            arr=re.exec(tmpDoc);
            counter = 0;
            while(arr!==null){
              //console.log(counter);
              //console.log(arr[1]);
              const words = arr[1].split('\t');
              //console.log(words[0]);
              if(counter == 0){
                //document.getElementById("table0caption").appendChild(document.createTextNode(words[0]));
              }
              else{
                  var newRow = FE_Numbers_Table.insertRow(FE_Numbers_Table.length),
                  cell1 = newRow.insertCell(0),
                  cell2 = newRow.insertCell(1),
                  cell3 = newRow.insertCell(2),
                  cell4 = newRow.insertCell(3),
                  cell5 = newRow.insertCell(4),
                  cell6 = newRow.insertCell(5),
                  cell7 = newRow.insertCell(6);
                  
                  cell1.innerHTML = words[0];
                  cell2.innerHTML = words[1];
                  cell3.innerHTML = words[2];
                  cell4.innerHTML = words[3];
                  cell5.innerHTML = words[4];
                  cell6.innerHTML = words[5];
                  cell7.innerHTML = words[6];
                  selectRowToInputFE_Numbers_Table();
              }
              //oP=document.createElement("P");
              //document.getElementById("news").appendChild(oP).appendChild(document.createTextNode(arr[1]));
              //document.getElementById("news").appendChild(document.createTextNode("\r\n"));
              arr=re.exec(tmpDoc);
              ++counter;
            }
            xmlHttp=null;
          }
        }
      };
      xmlHttp.open("POST", fileName, true); //Use POST to prevent use of cached file
      xmlHttp.send();
    }
    
    function restoreDefaultFE_Numbers_Table(){
      executeAsynchronously([clear_FE_Numbers_Table, getDefaultFE_Numbers_Table], 1);
    }
    
    function clear_FE_Numbers_Table(){
      //document.getElementById("table0caption").value = "";
      for(var i = FE_Numbers_Table.rows.length - 1; i >= 0; --i){
        FE_Numbers_Table.deleteRow(i);
      }
      document.getElementById("Time_FE_Numbers_Table").value = "";
      document.getElementById("PV_FE_Numbers_Table").value = "";
      document.getElementById("Taxi_FE_Numbers_Table").value = "";
      document.getElementById("LDT_FE_Numbers_Table").value = "";
      document.getElementById("Urban_Bus_FE_Numbers_Table").value = "";
      document.getElementById("Road_Bus_FE_Numbers_Table").value = "";
      document.getElementById("HDV_FE_Numbers_Table").value = "";
    }
    //=================================================================================================================================
    var FE_Numbers_Table_rIndex,
        FE_Numbers_Table = document.getElementById("FE_Numbers_Table");
        
    // check the empty input
    function checkFE_Numbers_TableEmptyInput(){
      var isEmpty = false,
          Time_FE_Numbers_Table = document.getElementById("Time_FE_Numbers_Table").value,
          PV_FE_Numbers_Table = document.getElementById("PV_FE_Numbers_Table").value,
          Taxi_FE_Numbers_Table = document.getElementById("Taxi_FE_Numbers_Table").value,
          LDT_FE_Numbers_Table = document.getElementById("LDT_FE_Numbers_Table").value,
          Urban_Bus_FE_Numbers_Table = document.getElementById("Urban_Bus_FE_Numbers_Table").value,
          Road_Bus_FE_Numbers_Table = document.getElementById("Road_Bus_FE_Numbers_Table").value,
          HDV_FE_Numbers_Table = document.getElementById("HDV_FE_Numbers_Table").value;
          
          if(Time_FE_Numbers_Table === ""){
            alert("Time_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(PV_FE_Numbers_Table === ""){
            alert("PV_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Taxi_FE_Numbers_Table === ""){
            alert("Taxi_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(LDT_FE_Numbers_Table === ""){
            alert("LDT_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Urban_Bus_FE_Numbers_Table === ""){
            alert("Urban_Bus_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Road_Bus_FE_Numbers_Table === ""){
            alert("Road_Bus_FE_Numbers_Table");
            isEmpty = true;
          }
          if(HDV_FE_Numbers_Table === ""){
            alert("HDV_FE_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          return isEmpty;
    }
  
    // add Row
    function addHTMLFE_Numbers_TableRow(){
      // get the table by id
      // create a new row and cells
      // get value from input text
      // set the values into row cell's
      if(!checkFE_Numbers_TableEmptyInput()){
        var newRow = FE_Numbers_Table.insertRow(table.length),
        cell1 = newRow.insertCell(0),
        cell2 = newRow.insertCell(1),
        cell3 = newRow.insertCell(2),
        cell4 = newRow.insertCell(3),
        cell5 = newRow.insertCell(4),
        cell6 = newRow.insertCell(5),
        cell7 = newRow.insertCell(6),
        Time_FE_Numbers_Table = document.getElementById("Time_FE_Numbers_Table").value,
        PV_FE_Numbers_Table = document.getElementById("PV_FE_Numbers_Table").value,
        Taxi_FE_Numbers_Table = document.getElementById("Taxi_FE_Numbers_Table").value,
        LDT_FE_Numbers_Table = document.getElementById("LDT_FE_Numbers_Table").value,
        Urban_Bus_FE_Numbers_Table = document.getElementById("Urban_Bus_FE_Numbers_Table").value,
        Road_Bus_FE_Numbers_Table = document.getElementById("Road_Bus_FE_Numbers_Table").value,
        HDV_FE_Numbers_Table = document.getElementById("HDV_FE_Numbers_Table").value;
        
        cell1.innerHTML = Time_FE_Numbers_Table;
        cell2.innerHTML = PV_FE_Numbers_Table;
        cell3.innerHTML = Taxi_FE_Numbers_Table;
        cell4.innerHTML = LDT_FE_Numbers_Table;
        cell5.innerHTML = Urban_Bus_FE_Numbers_Table;
        cell6.innerHTML = Road_Bus_FE_Numbers_Table;
        cell7.innerHTML = HDV_FE_Numbers_Table;
        
        // call the function to set the event to the new row
        selectRowToInputFE_Numbers_Table();
      }
    }
    
    // display selected row data into input text
    function selectRowToInputFE_Numbers_Table(){
      //console.log("running select from vehicle population");
      for(var i = 0; i < FE_Numbers_Table.rows.length; i++){
        FE_Numbers_Table.rows[i].onclick = function(){
          // get the selected row index
          FE_Numbers_Table_rIndex = this.rowIndex;
          //console.log(Mileage_Table_rIndex);
          document.getElementById("Time_FE_Numbers_Table").value = this.cells[0].innerHTML;
          document.getElementById("PV_FE_Numbers_Table").value = this.cells[1].innerHTML;
          document.getElementById("Taxi_FE_Numbers_Table").value = this.cells[2].innerHTML;
          document.getElementById("LDT_FE_Numbers_Table").value = this.cells[3].innerHTML;
          document.getElementById("Urban_Bus_FE_Numbers_Table").value = this.cells[4].innerHTML;
          document.getElementById("Road_Bus_FE_Numbers_Table").value = this.cells[5].innerHTML;
          document.getElementById("HDV_FE_Numbers_Table").value = this.cells[6].innerHTML;
        }
      }
    }
    
    selectRowToInputFE_Numbers_Table();
    
    function editHtmlFE_Numbers_TableSelecctedRow(){
      if(FE_Numbers_Table_rIndex != 0){
        var Time_FE_Numbers_Table = document.getElementById("Time_FE_Numbers_Table").value,
            PV_FE_Numbers_Table = document.getElementById("PV_FE_Numbers_Table").value,
            Taxi_FE_Numbers_Table = document.getElementById("Taxi_FE_Numbers_Table").value,
            LDT_FE_Numbers_Table = document.getElementById("LDT_FE_Numbers_Table").value,
            Urban_Bus_FE_Numbers_Table = document.getElementById("Urban_Bus_FE_Numbers_Table").value,
            Road_Bus_FE_Numbers_Table = document.getElementById("Road_Bus_FE_Numbers_Table").value,
            HDV_FE_Numbers_Table = document.getElementById("HDV_FE_Numbers_Table").value;
            
        if(!checkFE_Numbers_TableEmptyInput()){
          //console.log(Mileage_Table);
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[0].innerHTML = Time_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[1].innerHTML = PV_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[2].innerHTML = Taxi_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[3].innerHTML = LDT_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[4].innerHTML = Urban_Bus_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[5].innerHTML = Road_Bus_FE_Numbers_Table;
          FE_Numbers_Table.rows[FE_Numbers_Table_rIndex].cells[6].innerHTML = HDV_FE_Numbers_Table;
        }
      }
    }
    
    function removeSelectedRowFE_Numbers_Table(){
      if(FE_Numbers_Table_rIndex != 0){
        FE_Numbers_Table.deleteRow(FE_Numbers_Table_rIndex);
      }
      // clear input text
          document.getElementById("Time_FE_Numbers_Table").value = "";
          document.getElementById("PV_FE_Numbers_Table").value = "";
          document.getElementById("Taxi_FE_Numbers_Table").value = "";
          document.getElementById("LDT_FE_Numbers_Table").value = "";
          document.getElementById("Urban_Bus_FE_Numbers_Table").value = "";
          document.getElementById("Road_Bus_FE_Numbers_Table").value = "";
          document.getElementById("HDV_FE_Numbers_Table").value = "";
    }
    //==========================================================================================================================
    function getDefaultEV_Numbers_Table(){
      var fileName="EV_Numbers_Default.txt", xmlHttp=new XMLHttpRequest();
      xmlHttp.onreadystatechange=function(){
        var tmpDoc, re=/^(.+)$/gm, arr=[], oP;
        if(xmlHttp.readyState===4){
          if(xmlHttp.status===200){
            tmpDoc=xmlHttp.responseText;
            re.lastIndex = 0;
            arr=re.exec(tmpDoc);
            counter = 0;
            while(arr!==null){
              //console.log(counter);
              //console.log(arr[1]);
              const words = arr[1].split('\t');
              //console.log(words[0]);
              if(counter == 0){
                //document.getElementById("table0caption").appendChild(document.createTextNode(words[0]));
              }
              else{
                  var newRow = EV_Numbers_Table.insertRow(EV_Numbers_Table.length),
                  cell1 = newRow.insertCell(0),
                  cell2 = newRow.insertCell(1),
                  cell3 = newRow.insertCell(2),
                  cell4 = newRow.insertCell(3),
                  cell5 = newRow.insertCell(4),
                  cell6 = newRow.insertCell(5),
                  cell7 = newRow.insertCell(6),
                  cell8 = newRow.insertCell(7);
                  
                  cell1.innerHTML = words[0];
                  cell2.innerHTML = words[1];
                  cell3.innerHTML = words[2];
                  cell4.innerHTML = words[3];
                  cell5.innerHTML = words[4];
                  cell6.innerHTML = words[5];
                  cell7.innerHTML = words[6];
                  cell8.innerHTML = words[7];
                  selectRowToInputEV_Numbers_Table();
              }
              //oP=document.createElement("P");
              //document.getElementById("news").appendChild(oP).appendChild(document.createTextNode(arr[1]));
              //document.getElementById("news").appendChild(document.createTextNode("\r\n"));
              arr=re.exec(tmpDoc);
              ++counter;
            }
            xmlHttp=null;
          }
        }
      };
      xmlHttp.open("POST", fileName, true); //Use POST to prevent use of cached file
      xmlHttp.send();
    }
    
    function restoreDefaultEV_Numbers_Table(){
      executeAsynchronously([clear_EV_Numbers_Table, getDefaultEV_Numbers_Table], 1);
    }
    
    function clear_EV_Numbers_Table(){
      //document.getElementById("table0caption").value = "";
      for(var i = EV_Numbers_Table.rows.length - 1; i >= 0; --i){
        EV_Numbers_Table.deleteRow(i);
      }
      document.getElementById("Time_EV_Numbers_Table").value = "";
      document.getElementById("Sales_EV_Numbers_Table").value = "";
      document.getElementById("PV_EV_Numbers_Table").value = "";
      document.getElementById("Taxi_EV_Numbers_Table").value = "";
      document.getElementById("LDT_EV_Numbers_Table").value = "";
      document.getElementById("Urban_Bus_EV_Numbers_Table").value = "";
      document.getElementById("Road_Bus_EV_Numbers_Table").value = "";
      document.getElementById("HDV_EV_Numbers_Table").value = "";
    }
    //=================================================================================================================================
    var EV_Numbers_Table_rIndex,
        EV_Numbers_Table = document.getElementById("EV_Numbers_Table");
        
    // check the empty input
    function checkEV_Numbers_TableEmptyInput(){
      var isEmpty = false,
          Time_EV_Numbers_Table = document.getElementById("Time_EV_Numbers_Table").value,
          Sales_EV_Numbers_Table = document.getElementById("Sales_EV_Numbers_Table").value,
          PV_EV_Numbers_Table = document.getElementById("PV_EV_Numbers_Table").value,
          Taxi_EV_Numbers_Table = document.getElementById("Taxi_EV_Numbers_Table").value,
          LDT_EV_Numbers_Table = document.getElementById("LDT_EV_Numbers_Table").value,
          Urban_Bus_EV_Numbers_Table = document.getElementById("Urban_Bus_EV_Numbers_Table").value,
          Road_Bus_EV_Numbers_Table = document.getElementById("Road_Bus_EV_Numbers_Table").value,
          HDV_EV_Numbers_Table = document.getElementById("HDV_EV_Numbers_Table").value;
          
          if(Time_EV_Numbers_Table === ""){
            alert("Time_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Sales_EV_Numbers_Table === ""){
            alert("Sales_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(PV_EV_Numbers_Table === ""){
            alert("PV_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(Taxi_EV_Numbers_Table === ""){
            alert("Taxi_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(LDT_EV_Numbers_Table === ""){
            alert("LDT_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          
          if(Urban_Bus_EV_Numbers_Table === ""){
            alert("Urban_Bus_EV_Numbers_Table");
            isEmpty = true;
          }
          if(Road_Bus_EV_Numbers_Table === ""){
            alert("Road_Bus_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          if(HDV_EV_Numbers_Table === ""){
            alert("HDV_EV_Numbers_Table Cannot Be Empty");
            isEmpty = true;
          }
          return isEmpty;
    }
  
    // add Row
    function addHTMLEV_Numbers_TableRow(){
      // get the table by id
      // create a new row and cells
      // get value from input text
      // set the values into row cell's
      if(!checkEV_Numbers_TableEmptyInput()){
        var newRow = EV_Numbers_Table.insertRow(table.length),
        cell1 = newRow.insertCell(0),
        cell2 = newRow.insertCell(1),
        cell3 = newRow.insertCell(2),
        cell4 = newRow.insertCell(3),
        cell5 = newRow.insertCell(4),
        cell6 = newRow.insertCell(5),
        cell7 = newRow.insertCell(6),
        cell8 = newRow.insertCell(7),
        Time_EV_Numbers_Table = document.getElementById("Time_EV_Numbers_Table").value,
        Sales_EV_Numbers_Table = document.getElementById("Sales_EV_Numbers_Table").value,
        PV_EV_Numbers_Table = document.getElementById("PV_EV_Numbers_Table").value,
        Taxi_EV_Numbers_Table = document.getElementById("Taxi_EV_Numbers_Table").value,
        LDT_EV_Numbers_Table = document.getElementById("LDT_EV_Numbers_Table").value,
        Urban_Bus_EV_Numbers_Table = document.getElementById("Urban_Bus_EV_Numbers_Table").value,
        Road_Bus_EV_Numbers_Table = document.getElementById("Road_Bus_EV_Numbers_Table").value,
        HDV_EV_Numbers_Table = document.getElementById("HDV_EV_Numbers_Table").value;
        
        cell1.innerHTML = Time_EV_Numbers_Table;
        cell2.innerHTML = Sales_EV_Numbers_Table;
        cell3.innerHTML = PV_EV_Numbers_Table;
        cell4.innerHTML = Taxi_EV_Numbers_Table;
        cell5.innerHTML = LDT_EV_Numbers_Table;
        cell6.innerHTML = Urban_Bus_EV_Numbers_Table;
        cell7.innerHTML = Road_Bus_EV_Numbers_Table;
        cell8.innerHTML = HDV_EV_Numbers_Table;
        
        // call the function to set the event to the new row
        selectRowToInputEV_Numbers_Table();
      }
    }
    
    // display selected row data into input text
    function selectRowToInputEV_Numbers_Table(){
      //console.log("running select from vehicle population");
      for(var i = 0; i < EV_Numbers_Table.rows.length; i++){
        EV_Numbers_Table.rows[i].onclick = function(){
          // get the selected row index
          EV_Numbers_Table_rIndex = this.rowIndex;
          //console.log(Mileage_Table_rIndex);
          document.getElementById("Time_EV_Numbers_Table").value = this.cells[0].innerHTML;
          document.getElementById("Sales_EV_Numbers_Table").value = this.cells[1].innerHTML;
          document.getElementById("PV_EV_Numbers_Table").value = this.cells[2].innerHTML;
          document.getElementById("Taxi_EV_Numbers_Table").value = this.cells[3].innerHTML;
          document.getElementById("LDT_EV_Numbers_Table").value = this.cells[4].innerHTML;
          document.getElementById("Urban_Bus_EV_Numbers_Table").value = this.cells[5].innerHTML;
          document.getElementById("Road_Bus_EV_Numbers_Table").value = this.cells[6].innerHTML;
          document.getElementById("HDV_EV_Numbers_Table").value = this.cells[7].innerHTML;
        }
      }
    }
    
    selectRowToInputEV_Numbers_Table();
    
    function editHtmlEV_Numbers_TableSelecctedRow(){
      if(EV_Numbers_Table_rIndex != 0){
        var Time_EV_Numbers_Table = document.getElementById("Time_EV_Numbers_Table").value,
            Sales_EV_Numbers_Table = document.getElementById("Sales_EV_Numbers_Table").value,
            PV_EV_Numbers_Table = document.getElementById("PV_EV_Numbers_Table").value,
            Taxi_EV_Numbers_Table = document.getElementById("Taxi_EV_Numbers_Table").value,
            LDT_EV_Numbers_Table = document.getElementById("LDT_EV_Numbers_Table").value,
            Urban_Bus_EV_Numbers_Table = document.getElementById("Urban_Bus_EV_Numbers_Table").value,
            Road_Bus_EV_Numbers_Table = document.getElementById("Road_Bus_EV_Numbers_Table").value,
            HDV_EV_Numbers_Table = document.getElementById("HDV_EV_Numbers_Table").value;
            
        if(!checkEV_Numbers_TableEmptyInput()){
          //console.log(Mileage_Table);
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[0].innerHTML = Time_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[1].innerHTML = Sales_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[2].innerHTML = PV_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[3].innerHTML = Taxi_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[4].innerHTML = LDT_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[5].innerHTML = Urban_Bus_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[6].innerHTML = Road_Bus_EV_Numbers_Table;
          EV_Numbers_Table.rows[EV_Numbers_Table_rIndex].cells[7].innerHTML = HDV_EV_Numbers_Table;
        }
      }
    }
    
    function removeSelectedRowEV_Numbers_Table(){
      if(EV_Numbers_Table_rIndex != 0){
        EV_Numbers_Table.deleteRow(EV_Numbers_Table_rIndex);
      }
      // clear input text
          document.getElementById("Time_EV_Numbers_Table").value = "";
          document.getElementById("Sales_EV_Numbers_Table").value = "";
          document.getElementById("PV_EV_Numbers_Table").value = "";
          document.getElementById("Taxi_EV_Numbers_Table").value = "";
          document.getElementById("LDT_EV_Numbers_Table").value = "";
          document.getElementById("Urban_Bus_EV_Numbers_Table").value = "";
          document.getElementById("Road_Bus_EV_Numbers_Table").value = "";
          document.getElementById("HDV_EV_Numbers_Table").value = "";
    }
    
    function notSupportedYet(){
      alert("not supported yet!!");
    }