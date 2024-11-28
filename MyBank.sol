// SPDX-License-Identifier: Unlicensed
pragma solidity ^0.6.0;

contract MyBank {
    mapping(address => uint) private _balances;
    address public owner;
    event LogDepositMade(address accountHolder, uint amount);

    constructor() public {
        owner = msg.sender;
        // Initialize the owner's balance to 1000 (optional)
        _balances[msg.sender] = 1000;
        emit LogDepositMade(msg.sender, 1000);
    }

    function deposit() public payable returns (uint) {
        require((_balances[msg.sender] + msg.value) > _balances[msg.sender], "Overflow error");
        require(msg.sender != address(0), "Invalid address");
        _balances[msg.sender] += msg.value;
        emit LogDepositMade(msg.sender, msg.value);
        return _balances[msg.sender];
    }

    function withdraw(uint withdrawAmount) public returns (uint) {
        require(_balances[msg.sender] >= withdrawAmount, "Insufficient balance");
        require(msg.sender != address(0), "Invalid address");
        require(_balances[msg.sender] > 0, "No balance to withdraw");
        _balances[msg.sender] -= withdrawAmount;
        msg.sender.transfer(withdrawAmount);
        emit LogDepositMade(msg.sender, withdrawAmount);
        return _balances[msg.sender];
    }

    function viewBalance() public view returns (uint) {
        return _balances[msg.sender];
    }
}
